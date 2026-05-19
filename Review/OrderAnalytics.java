// Order Analytics with Streams & Lambdas 
// Lambda Functions, Functional Interfaces, Streams, Collectors, Collection API Updates 
// The analytics team needs to process thousands of orders to generate insights — top restaurants, average delivery times, revenue by category using Java 8's declarative stream pipeline. 
// ― 
// Tasks: 
// 31. Create a functional interface OrderFilter with method boolean test(Order o). Implement it three ways: (a) anonymous class, (b) lambda, (c) method reference - all filtering orders with total > 500. Show how lambda eliminates the anonymous class boilerplate. 
// 32. Use built-in functional interfaces on a List<Order>: Predicate<Order> for orders placed today, 
// Function<Order, String> to extract customer name, Consumer<Order> to print order summary, Supplier<Order> to create a blank Order. Chain Predicate with .and() and .or(). 
// 33. Use stream pipeline on List<Order>: filter orders with status 'DELIVERED', map to revenue 
// amount, sort descending, limit to top 5, collect to List<Double>. Then separately use Collectors.groupingBy(Order::getRestaurantName) to group orders and Collectors.counting() to 
// count per restaurant. 
// 34. Use reduce() to compute total platform revenue from all delivered orders. Use 
// mapToDouble().average() to find average order value. Use 
// max(Comparator.comparing Double(Order::getTotal)) to find the highest order. All in separate stream pipelines. 
// 35. Apply Collection API updates: use Map.computelfAbsent() to build a Map<String, List<Order>> 
// grouping by city without null checks. Use List.removelf() to remove cancelled orders in place. Use Map.forEach() to print the city-wise summary report. 


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class OrderAnalytics {
    static class Order{
        String name;
        double total;
        String status;
        String restaurant;
        String city;

        public Order(String name, double total, String status, String restaurant, String city) {
            this.name = name;
            this.total = total;
            this.status = status;
            this.restaurant = restaurant;
            this.city = city;
        }

        public double getTotal() {
            return total;
        }

        public String getStatus() {
            return status;
        }

        public String getRestaurant() {
            return restaurant;
        }

        public String toString() {
            return name + " rs" + total + " " + status;
        }
    }
    interface OrderFilter{
        boolean test(Order o);
    }

    public static void main(String[] args){
        List<Order> orders=Arrays.asList(
                new Order("abc",500,"DELIVERED", "dominos", "delhi"),
                new Order("def",300,"CANCELLED", "pizza hut", "mumbai"),
                new Order("ghi",700,"DELIVERED", "dominos", "delhi"),
                new Order("jkl",200,"DELIVERED", "pizza hut", "mumbai"),
                new Order("mno",600,"CANCELLED", "dominos", "delhi")
        );

        OrderFilter f1=new OrderFilter(){
            public boolean test(Order o) {
                return o.getTotal() > 500;
            }
        };
    
        OrderFilter f2=o->o.getTotal()>500;
        
        orders.stream().filter(f2::test).forEach(System.out::println);

        Predicate<Order> p1=o->o.getStatus().equals("DELIVERED");

        Predicate<Order> p2=o-> o.getTotal()>500;

        orders.stream().filter(p1).filter(p2).forEach(System.out::println);

        Function<Order, String> extractName=o->o.name;
        Consumer<Order> printSummary=o-> System.out.println(o.name + " ordered from " + o.restaurant + " for rs" + o.total);
        Supplier<Order> newOrder=()-> new Order("new",0,"NEW","dominos","xyz");

        System.out.println("Extracted Name: " + extractName.apply(orders.get(3)));
        printSummary.accept(orders.get(0));
        System.out.println("New Order: " + newOrder.get());

        List<Double> Revenue=orders.stream()
                .filter(o->o.getStatus().equals("DELIVERED"))
                .map(o->o.getTotal())        
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Top 5 Revenues: " + Revenue);
        
        Map<String, Long> ordersByRestaurant=orders.stream()
                .collect(Collectors.groupingBy(Order::getRestaurant, Collectors.counting()));
        System.out.println("Orders by Restaurant: " + ordersByRestaurant);

        double totalRevenue=orders.stream()
                .filter(o->o.getStatus().equals("DELIVERED"))
                .mapToDouble(Order::getTotal)
                .sum();
        
        System.out.println("Total Revenue: rs" + totalRevenue);

        double averageOrderValue=orders.stream()
                .filter(o->o.getStatus().equals("DELIVERED"))
                .mapToDouble(Order::getTotal)
                .average()
                .orElse(0.0);
        System.out.println("Average Order Value: rs" + averageOrderValue);

    }
}