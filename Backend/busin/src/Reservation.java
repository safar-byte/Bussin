

import java.util.ArrayList;

    public class Reservation {


        public void seatUpdater(ArrayList<Bus> bus, ArrayList<Reserve> res) throws Exception{
            for (Reserve varRes : res) {
                try {
                    if (varRes.getAction().equals("reserve")) {
                        for (Bus newbus : bus) {
                            if (newbus.getBusName().equals(varRes.getBusName())) {
                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1));
                                if (Integer.parseInt(newbus.getSeatcnt()) >= 0) {
                                    newbus.setReserve(newbus.getReserve() - 1);
                                    System.out.println("SEAT RESERVED FOR  " + newbus.getBusName());
                                    if (newbus.getCnc() == 1) {
                                        newbus.setCnc(0);
                                    }
                                } else if (newbus.getResv() != 1) {
                                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1));
                                    newbus.setResv(1);
                                    throw new Exception("SEATS ARE FULL FOR " + newbus.getBusName() + " AFTER " + newbus.getReserve());
                                }
                                else{
                                    throw new Exception("NO SEATS ARE AVAILABLE");
                                }
                            }
                        }
                    }

                    if (varRes.getAction().equals("cancel")) {
                        for (Bus newbus : bus) {
                            if (newbus.getBusName().equals(varRes.getBusName())) {
                                newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) + 1));
                                if (Integer.parseInt(newbus.getSeatcnt()) <= Integer.parseInt(newbus.getMaxCnt())) {
                                    newbus.setCancel(newbus.getCancel() + 1);
                                    System.out.println("SEAT CANCELLED FOR  " + newbus.getBusName());
                                    if (newbus.getResv() == 1) {
                                        newbus.setResv(0);
                                    }
                                }
                                else if (newbus.getCnc() != 1) {
                                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1));
                                    newbus.setCnc(1);
                                    throw new Exception("NO SEATS ARE RESERVED AFTER CANCEL " + newbus.getCancel()+" FOR "+newbus.getBusName());
                                }
                                else {
                                    throw new Exception("SEATS ARE AVAILABLE FOR RESERVATION");
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
