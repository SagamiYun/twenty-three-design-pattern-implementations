package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
观察者模式测试
*/
func TestObserverPattern(t *testing.T) {
	subject := &patterns.ConcreteSubject{}

	observer1 := &patterns.ConcreteObserver{ID: "1"}
	observer2 := &patterns.ConcreteObserver{ID: "2"}

	subject.Register(observer1)
	subject.Register(observer2)

	subject.NotifyAll("Hello!")

	subject.Deregister(observer1)

	subject.NotifyAll("Hello again!")
}
