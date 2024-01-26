package patterns

import "fmt"

type Target interface {
	Request() string
}

type Adaptee struct {
	SpecificRequest string
}

type Adapter struct {
	Adaptee *Adaptee
}

func (a *Adapter) Request() string {
	return a.Adaptee.SpecificRequest
}

func NewAdapter(a *Adaptee) Target {
	return &Adapter{a}
}

func main() {
	adaptee := &Adaptee{"Adaptee method"}
	target := NewAdapter(adaptee)
	fmt.Println(target.Request())
}
