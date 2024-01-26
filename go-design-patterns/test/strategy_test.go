package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
策略模式测试
*/
func TestStrategy(t *testing.T) {
	context := patterns.NewContext(patterns.OperationAdd{})
	result := context.ExecuteStrategy(5, 3)
	if result != 8 {
		t.Errorf("Expected 8, but got %d", result)
	}
}
