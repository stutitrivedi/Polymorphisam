
public class Main {
        public static void main(String[] args) {
            Ship[] ships = new Ship[3];
            ships[0] = new Ship("Titanic", "1912");
            ships[1] = new CruiseShip("Disney Magic", "1998", 2400);
            ships[2] = new CargoShip("Emma Maersk", "2006", 170000);

            for (Ship ship : ships) {
                ship.print();
                System.out.println();
            }
        }
    }