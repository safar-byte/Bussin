import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reservation {
//    public void seatUpdater( ArrayList<Bus> bus ,ArrayList<Reserve> res) {
//        Set<String> uniqBusSet = new HashSet<>();
//        for (Reserve var : res) {
//            uniqBusSet.add(var.getBusName());
//        }
////added
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

    public void seatUpdater(ArrayList<Bus> bus ,ArrayList<Reserve> res)
    {
        for(Reserve varRes :res)
        {
            if(varRes.getAction().equals("reserve"))
            {
                for(Bus newbus:bus) {
                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt()) - 1));
                    newbus.setReserve(newbus.getReserve()+1);
                }
            }
            if(varRes.getAction().equals("cancel"))
            {
                for(Bus newbus:bus) {
                    newbus.setSeatcnt(String.valueOf(Integer.parseInt(newbus.getSeatcnt())+1));
                    newbus.setReserve(newbus.getCancel()+1);
                }
            }
        }
    }
}