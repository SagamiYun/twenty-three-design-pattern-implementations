package patterns

import "fmt"

type Component interface {
	Operation() string
}

type ConcreteComponent struct{}

func (c *ConcreteComponent) Operation() string {
	return "ConcreteComponent"
}

type Decorator struct {
	component Component
}

func (d *Decorator) Operation() string {
	return fmt.Sprintf("Decorator(%s)", d.component.Operation())
}

func NewDecorator(c Component) Component {
	return &Decorator{c}
}
