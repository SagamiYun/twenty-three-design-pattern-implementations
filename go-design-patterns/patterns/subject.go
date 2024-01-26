package patterns

import "fmt"

type Subject interface {
	Register(Observer)
	Deregister(Observer)
	NotifyAll(string)
}

type Observer interface {
	Notify(string)
}

type ConcreteSubject struct {
	Observers []Observer
}

func (s *ConcreteSubject) Register(o Observer) {
	s.Observers = append(s.Observers, o)
}

func (s *ConcreteSubject) Deregister(o Observer) {
	for i, observer := range s.Observers {
		if observer == o {
			s.Observers = append(s.Observers[:i], s.Observers[i+1:]...)
		}
	}
}

func (s *ConcreteSubject) NotifyAll(m string) {
	for _, observer := range s.Observers {
		observer.Notify(m)
	}
}

type ConcreteObserver struct {
	ID string
}

func (o *ConcreteObserver) Notify(m string) {
	fmt.Println("Observer", o.ID, "received message:", m)
}
