package test

import (
	"go-design-patterns/patterns"
	"testing"
)

/*
适配器模式测试
*/
func TestAdapter(t *testing.T) {
	adapted := &patterns.Adaptee{SpecificRequest: "Adapted method"}
	target := patterns.NewAdapter(adapted)
	if target.Request() != "Adapted method" {
		t.Errorf("Expected 'Adaptee method', but got '%s'", target.Request())
	}
}
