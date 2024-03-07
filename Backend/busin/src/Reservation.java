//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Reservation {
//    Integer cnc=0;
//    Integer resv=0;
//    public void seatUpdater( ArrayList<Bus> bus ,ArrayList<Reserve> res) {
//        Set<String> uniqBusSet = new HashSet<>();
//        for (Reserve var : res) {
//            uniqBusSet.add(var.getBusName());
//        }
////added new
//        for(String busname:uniqBusSet)
//        {
//            for(Reserve varRes:res)
//            {
//                if(varRes.getBusName().equals(busname))
//                {
//                    if(varRes.getAction().equals("Reserve"))
//                    {
//                        for(Bus newbus:bus)
//                        {
//                            if(newbus.getBusName().equals(varRes.getBusName()))
//                            {
//                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt())-1));
//                            }
//                        }
//                    }
//                    if(varRes.getAction().equals("Leave"))
//                    {
//                        for(Bus newbus:bus)
//                        {
//                            if(newbus.getBusName().equals(varRes.getBusName()))
//                            {
//                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt())+1));
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }

    import java.util.ArrayList;

    public class Reservation {
        Integer cnc = 0; // Indicator for seat cancellation exception
        Integer resv = 0; // Indicator for seat reservation exception

        public void seatUpdater(ArrayList<Bus> bus, ArrayList<Reserve> res) {
            for (Reserve varRes : res) { // Loop over each reservation entry
                try {
                    if (varRes.getAction().equals("reserve")) { // If reservation action is "reserve"
                        for (Bus newbus : bus) { // Iterate over each bus
                            if (newbus.getBusName().equals(varRes.getBusName())) { // Check if bus name matches reservation
                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1)); // Decrease seat count
                                if (Integer.parseInt(newbus.getSeatcnt()) >= 0) { // If seats are available
                                    newbus.setReserve(newbus.getReserve() - 1); // Update reservation count
                                    System.out.println("SEAT RESERVED FOR  " + newbus.getBusName());
                                    if (cnc == 1) {
                                        cnc = 0; // Reset cancellation exception indicator
                                    }
                                } else if (resv != 1) { // If reservation exception not triggered
                                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1)); // Revert seat count
                                    resv = 1; // Set reservation exception indicator
                                    throw new Exception("SEATS ARE FULL AFTER " + newbus.getBusName() + " after " + newbus.getReserve());
                                }
                                else{
                                    throw new Exception("NO RESERVATION");
                                }
                            }
                        }
                    }

                    if (varRes.getAction().equals("cancel")) { // If reservation action is "cancel"
                        for (Bus newbus : bus) { // Iterate over each bus
                            if (newbus.getBusName().equals(varRes.getBusName())) { // Check if bus name matches reservation
                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1)); // Increase seat count
                                if (Integer.parseInt(newbus.getSeatcnt()) <= Integer.parseInt(newbus.getMaxCnt())) { // If seats are within capacity
                                    newbus.setCancel(newbus.getCancel() + 1); // Update cancellation count
                                    System.out.println("SEAT CANCELLED FOR  " + newbus.getBusName());
                                    if (resv == 1) {
                                        resv = 0; // Reset reservation exception indicator
                                    }
                                } else if (cnc != 1) { // If cancellation exception not triggered
                                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1)); // Revert seat count
                                    cnc = 1; // Set cancellation exception indicator
                                    throw new Exception("NO SEATS ARE RESERVED AFTER CANCEL " + newbus.getCancel()+"for"+newbus.getBusName());
                                }
                                else {
                                    throw new Exception("NO SEATS");
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // Print exception message
                }
            }
        }
    }
