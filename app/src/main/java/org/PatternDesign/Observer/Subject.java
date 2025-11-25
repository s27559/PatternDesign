package org.PatternDesign.Observer;

import java.util.ArrayList;

public class Subject implements ISubject{

        private final ArrayList<IObserver> observers = new ArrayList<>();

        private String ProductName;
        private int ProductPrice;
        private String Availability;
        
        public Subject(String productName, int productPrice, String availability) {
                ProductName = productName;
                ProductPrice = productPrice;
                Availability = availability;
        }

        public String getProductName() {
                return ProductName;
        }

        public void setProductName(String productName) {
                ProductName = productName;
        }

        public int getProductPrice() {
                return ProductPrice;
        }

        public void setProductPrice(int productPrice) {
                ProductPrice = productPrice;
        }

        public String getAvailability() {
                return Availability;
        }

        public void setAvailability(String availability) {
                Availability = availability;
                System.out.println("Availability changed from Out of Stock to Available.");
                NotifyObservers();
        }

        @Override
        public void RegisterObserver(IObserver observer) {
                System.out.println("Observer Added : " + ((ConcreteObserver)observer).getUserName());
                observers.add(observer);
        }

        @Override
        public void RemoveObserver(IObserver observer) {
                System.out.println("Observer Removed : " + ((ConcreteObserver)observer).getUserName());
                observers.remove(observer);
        }

        @Override
        public void NotifyObservers() {
                System.out.println("Product Name :"
                            + ProductName + ", product Price : "
                            + ProductPrice + " is Now available. So, notifying all Registered users ");

                System.out.println();
                for (IObserver observer : observers) {
                        observer.Update(Availability);
                }
        }


}
