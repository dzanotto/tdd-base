import class1
import unittest

class Class1Test(unittest.TestCase):

	def test_failing(self):
		underTest = class1.Class1
		self.assertTrue(underTest.exampleFunction(), "I'm a failing test")

	def test_passing(self):
		self.assertTrue(True, "I'm a passing test!")

if __name__ == "__main__":
	unittest.main()
