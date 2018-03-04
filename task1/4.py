from abc import ABC, abstractmethod
class Person(ABC):
	@abstractmethod
	def set_name(self, name, age, gendor):
		self.name = name
		self.age = age
		self.gendor = gendor

	@abstractmethod
	def print_person(self):
		print(self.name, self.age, self.gendor)

class Parent(Person):
	def __init__(self, name, age, gendor):
		set_name(name, age, gendor)

class Child(Person):
	def __init__(self, name, age, gendor):
                set_name(name, age, gendor)

class Family(Person):
	def __init__(self, name_m, name_f, age_m, age_f):
		self.mother = Parent(name_m, age_m, 'f')
		self.father = Parent(name_f, age_f, 'm')
		self.child_count = 0
		self.children = []

	def set_child(self, name, age, gendor):
		self.children.append(Child(name, age, gendor))
		self.child_count+=1
