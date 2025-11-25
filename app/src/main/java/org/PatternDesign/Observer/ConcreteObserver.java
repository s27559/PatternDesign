package org.PatternDesign.Observer;

public class ConcreteObserver implements IObserver{
        private String userName;

        public ConcreteObserver(String userName) {
                this.userName = userName;
        
        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        @Override
        public void Update(String availability) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'Update'");
        }
}
