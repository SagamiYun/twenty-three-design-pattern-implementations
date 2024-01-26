package patterns

type Strategy interface {
	DoOperation(num1 int, num2 int) int
	// TO MORE Strategy
}

type OperationAdd struct{}

func (OperationAdd) DoOperation(num1 int, num2 int) int {
	return num1 + num2
}

type Context struct {
	strategy Strategy
}

func NewContext(strategy Strategy) *Context {
	return &Context{strategy: strategy}
}

func (c *Context) ExecuteStrategy(num1 int, num2 int) int {
	return c.strategy.DoOperation(num1, num2)
}
