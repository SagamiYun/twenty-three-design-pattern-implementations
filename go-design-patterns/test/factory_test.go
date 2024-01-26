package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
工厂模式测试
*/
func TestCarFactory(t *testing.T) {
	factory := &patterns.CarFactory{}
	car := factory.NewCar("Tesla")
	if car.Drive() != "Driving a Tesla car" {
		t.Errorf("Expected Driving a Tesla car, but got %s", car.Drive())
	}
}
