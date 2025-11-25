package org.PatternDesign.Observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ConcreteObserver implements IObserver{
        private String userName;

        public ConcreteObserver(String userName) {
                this.userName = userName;
        }
        
        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public void AddSubscriber(ISubject subject){
                subject.RegisterObserver(this);
        }

        public void RemoveSubscriber(ISubject subject){
                subject.RemoveObserver(this);
        }

        @Override
        public void Update(String availability) {
                System.out.println("A service for: " + userName + ", is now: " + availability);
        }
}
