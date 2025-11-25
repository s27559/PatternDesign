package org.PatternDesign.Observer;

public interface ISubject {

        void RegisterObserver(IObserver observer);
        void RemoveObserver(IObserver observer);
        void NotifyObservers();
}
