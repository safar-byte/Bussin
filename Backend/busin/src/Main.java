import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String filesrc = "C:\\Users\\Asus\\IdeaProjects\\sds\\CommonFiles\\bus-data.csv";
        String filesr = "C:\\Users\\Asus\\IdeaProjects\\sds\\CommonFiles\\mock-data2.csv";
        String filedesti = "C:\\Users\\Asus\\IdeaProjects\\sds\\CommonFiles\\";
        Scanner sc = new Scanner(System.in);

        CSVReader csvr = new CSVReader();
        CSVWriter csvw = new CSVWriter();

        //creating objects
        SourceDest sor = new SourceDest();
        Reservation re = new Reservation();
        ArrayList<Bus> Bus;
        ArrayList<Reserve> reserves;
        reserves =csvr.getReserveValue(filesr);
        Bus = csvr.getvalue(filesrc);

        re.seatUpdater(Bus,reserves);
        while (true) {
            System.out.println("=================================================================================================");
            System.out.println("\n1.TypeFiltering\n2.SourceDestinationFiltering\n3.TimeFiltering\n4.Reservation\n5.Exit");
            System.out.print("Enter the option:");
            int option = sc.nextInt();
            System.out.println("=================================================================================================");
            switch (option) {
                case 1:
                    csvw.CSVWriterTypeFilter(typeFilter.hasfilterByType(Bus), filedesti + "TypeFilterout.cvs");
                    break;

                case 2:
                    boolean vla = true;
                    while (vla) {
                        System.out.println("SorceDestinationFiltering");
                        System.out.println("1.SourceFilter\n2.DestinationFiltering\n3.SorceDestinationFiltering\n4.Exit");
                        System.out.print("Enter the option:");
                        int option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.print("Enter the Source:");
                                String Source = sc.next();
                                sor.runSourceDest(Bus, Source, "", "s", filedesti);
                                break;
                            case 2:
                                System.out.print("Enter the Destination:");
                                String Destination = sc.next();
                                sor.runSourceDest(Bus, "", Destination, "d", filedesti);
                                break;
                            case 3:
                                System.out.print("Enter the Source:");
                                String Source1 = sc.next();
                                System.out.print("Enter the Destination:");
                                String Destination2 = sc.next();
                                sor.runSourceDest(Bus, Source1, Destination2, "sd", filedesti);
                                break;
                            case 4:
                                vla = false;
                                break;
                            default:
                                System.out.println("Invalid Command");

                        }

                    }

                    break;
                case 3:{
                    boolean vla2 = true;
                    while (vla2) {
                        System.out.println("TimeFiltering");
                        System.out.println("1.08:00 to 12:00 \n2.12:00 to 16:00\n3.16:00 to 20:00\n4.20:00 to 08:00\n5.Exit");
                        System.out.print("Enter the option:");
                        int option2 = sc.nextInt();
                        switch (option2) {
                            case 1:

                                csvw.CSVWriterFilter(Time.Filter(Bus, "M"), filedesti + "MorningFilter.csv");
                                break;
                            case 2:
                                csvw.CSVWriterFilter(Time.Filter(Bus, "A"), filedesti + "AfterNoonFilter.csv");
                                break;
                            case 3:
                                csvw.CSVWriterFilter(Time.Filter(Bus, "E"), filedesti + "EveningFilter.csv");
                                break;
                            case 4:
                                csvw.CSVWriterFilter(Time.Filter(Bus, ""), filedesti + "NightFilter.csv");
                                break;
                            case 5:
                                vla2 = false;
                                break;
                            default:
                                System.out.println("Invalid Command");

                        }

                    }

            }break;
                case 4:
        csvw.CSVWriterFilter(Bus,filedesti+"reso.csv");
        break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Command");

            }


        }


        //This part of code is for reservation
//        reserves = csvr.getReserveValue(filesr);



    }
}