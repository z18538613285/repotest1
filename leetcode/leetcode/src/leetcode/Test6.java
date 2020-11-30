//package leetcode;
//
//import java.lang.reflect.Array;
//
//public class Test6 {
//
//    public abstract class Observer{
//        protected Subject subject;
//        public abstract void update();
//    }
//
//    public class Subject{
//        private List<Observer> observers = new ArrayList<>();
//        private int state;
//
//        public int getState(){
//            return state;
//        }
//
//        public void setState(int state){
//            this.state=state;
//            notifyAll();
//        }
//        public void notifyAllObservers(){
//            for(Observer observer:observers){
//                observer.update();
//            }
//        }
//    }
//}
