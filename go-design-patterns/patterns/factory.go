package patterns

type Car interface {
	Drive() string
}

type Tesla struct{}

func (t *Tesla) Drive() string {
	return "Driving a Tesla car"
}

type CarFactory struct{}

func (cf *CarFactory) NewCar(carType string) Car {
	if carType == "Tesla" {
		return &Tesla{}
	}
	// 可以添加其他车型
	return nil
}
