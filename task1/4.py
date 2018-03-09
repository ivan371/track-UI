from abc import ABC, abstractmethod
# abstract class Person
class Person(ABC):
	@abstractmethod
	def __init__(self, name, age, gendor):
		self.name = name
		self.age = age
		self.gendor = gendor

	def get_name(self):
		return self.name
	
	def get_age(self):
		return self.age
	
	def get_gendor(self):
		return self.gendor


# class Mother: 
class Mother(Person):
	def __init__(self, name, age):
		super().__init__(name, age, 'female')
	
	def __str__(self):
        	return "I am mother. I am {} years old. My name is {}".format(self.get_age(), self.get_name())
		
# class Father:
class Father(Person):
        def __init__(self, name, age):
                super().__init__(name, age, 'male')

        def __str__(self):
                return "I am father. I am {} years old. My name is {}".format(self.get_age(), self.get_name())


# class Child
class Child(Person):
	def __init__(self, name, age, gendor):
                super().__init__(name, age, gendor)

	def __str__(self):
        	return "I am child. I am {} years. My name is {}, I am {}".format(self.get_age(), self.get_name(), self.get_gendor())


father = Father('John', 30)
mother = Mother('Helen', 28)
child1 = Child('George', 5, 'male')
child2 = Child('Zoe', 3, 'female')
print(mother, father, child1, child2)
