import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reservation {
    Integer cnc=0;
    Integer resv=0;
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

    public void seatUpdater(ArrayList<Bus> bus, ArrayList<Reserve> res) {
        for (Reserve varRes : res)
            try {

            if (varRes.getAction().equals("reserve")) {
                for (Bus newbus : bus) {
                    if (newbus.getBusName().equals(varRes.getBusName())) {



                        newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1));
                        if (Integer.parseInt(newbus.getSeatcnt()) >= 0) {
                            newbus.setReserve(newbus.getReserve() - 1);

                            System.out.println("SEAT RESERVED FOR  " + newbus.getBusName());
                            if(cnc==1)
                            {
                                cnc=0;
                            }

                        } else if(resv!=1) {
                            newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1));
                            resv=1;
                            throw new Exception("SEATS ARE FULL AFTER" + newbus.getBusName()+"after"+newbus.getReserve());


                        }
                    }
                }
            }
                if (varRes.getAction().equals("cancel")) {
                    for (Bus newbus : bus) {
                        if (newbus.getBusName().equals(varRes.getBusName())) {
                            newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1));

                            if (Integer.parseInt(newbus.getSeatcnt()) <=Integer.parseInt(newbus.getMaxCnt())) {
                                newbus.setCancel(newbus.getCancel() + 1);
                                System.out.println("SEAT Cancelled FOR  " + newbus.getBusName());
                                if(resv==1)
                                {
                                    resv=0;
                                }

                            } else if(cnc!=1) {
                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1));
                                cnc=1;;
                                throw new Exception("NO SEATS ARE RESERVED AFTER CANCEL " + newbus.getCancel());


                            }
                        }
                    }
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    //add
