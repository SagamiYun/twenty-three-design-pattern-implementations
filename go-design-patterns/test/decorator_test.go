package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
装饰器模式测试
*/
func TestDecorator(t *testing.T) {
	var c patterns.Component = &patterns.ConcreteComponent{}
	c = patterns.NewDecorator(c)
	if c.Operation() != "Decorator(ConcreteComponent)" {
		t.Errorf("Expected 'Decorator(ConcreteComponent)', but got '%s'", c.Operation())
	}
}
