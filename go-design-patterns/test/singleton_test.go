package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
单例模式测试
*/
func TestSingleton(t *testing.T) {
	instance1 := patterns.GetInstance()
	instance2 := patterns.GetInstance()

	if instance1 != instance2 {
		t.Errorf("Expected same instance, but got different")
	}
}
