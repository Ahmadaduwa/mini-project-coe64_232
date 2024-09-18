    import java.util.ArrayList;
    import java.util.Date;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("P001", "Laptop", "Electronics", 15000.0, 10, 12000.0));
            products.add(new Product("P002", "Smartphone", "Electronics", 8000.0, 20, 6000.0));

            ArrayList<Member> members = new ArrayList<>();
            members.add(new Member("M001", "John Doe", "123 Street", "1990-01-01", "0123456789"));
            members.add(new Member("M002", "Jane Doe", "456 Avenue", "1985-03-05", "0987654321"));

            ArrayList<Employee> employees = new ArrayList<>();
            Date birthDate1 = new Date(90, 0, 1); 
            Date birthDate2 = new Date(85, 2, 5);
            employees.add(new Employee("M001", "John Doe", "123 Street", "1990-01-01", "0123456789",
                    "E001", "John Smith", "123 Street", birthDate1, 25000.0, "0123456789"));
                    employees.add(new Employee("M002", "Jane Doe", "456 Avenue", "1985-03-05", "0987654321",
                    "E002", "Jane Smith", "456 Avenue", birthDate2, 30000.0, "0987654321"));
                    
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\n==== Main Menu ====");
                System.out.println("1. View Products");
                System.out.println("2. View Members");
                System.out.println("3. View Employees");
                System.out.println("4. Add Product");
                System.out.println("5. Add Member");
                System.out.println("6. Add Employee");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        displayProducts(products);
                        break;
                    case "2":
                        displayMembers(members);
                        break;
                    case "3":
                        displayEmployees(employees);
                        break;
                    case "4":
                        products.add(addProduct(scanner));
                        break;
                    case "5":
                        members.add(addMember(scanner));
                        break;
                    case "6":
                        employees.add(addEmployee(scanner));
                        break;
                    case "7":
                        exit = confirmExit(scanner);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

            scanner.close();
            System.out.println("Program exited.");
        }

        public static void displayProducts(ArrayList<Product> products) {
            System.out.println("\n== Product List ==");
            for (Product product : products) {
                System.out.println("ID: " + product.getIdProduct() + ", Name: " + product.getNameProduct()
                        + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantityProduct());
            }
        }

        public static void displayMembers(ArrayList<Member> members) {
            System.out.println("\n== Member List ==");
            for (Member member : members) {
                System.out.println("ID: " + member.getId() + ", Name: " + member.getName()
                        + ", Phone: " + member.getNumber());
            }
        }

        public static void displayEmployees(ArrayList<Employee> employees) {
            System.out.println("\n== Employee List ==");
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getIdEmployee() + ", Name: " + employee.getNameEmployee()
                        + ", Salary: " + employee.calculatePay());
            }
        }

        public static Product addProduct(Scanner scanner) {
            System.out.println("\n== Add New Product ==");
            System.out.print("Enter product ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product type: ");
            String type = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter product cost: ");
            double cost = scanner.nextDouble();

            return new Product(id, name, type, price, quantity, cost);
        }

        public static Member addMember(Scanner scanner) {
            System.out.println("\n== Add New Member ==");
            System.out.print("Enter member ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter member name: ");
            String name = scanner.nextLine();
            System.out.print("Enter member address: ");
            String address = scanner.nextLine();
            System.out.print("Enter member birth date (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("Enter member phone number: ");
            String phone = scanner.nextLine();

            return new Member(id, name, address, date, phone);
        }

        public static Employee addEmployee(Scanner scanner) {
            System.out.println("\n== Add New Employee ==");
            System.out.print("Enter employee ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee address: ");
            String address = scanner.nextLine();
            System.out.print("Enter employee birth date (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("Enter employee phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            return new Employee(id, name, address, date, phone, id, name, address, new Date(), salary, phone);
        }

        public static boolean confirmExit(Scanner scanner) {
            System.out.print("Are you sure you want to exit? (y/n): ");
            String input = scanner.nextLine().toLowerCase();
            return input.equals("y");
        }
    }
