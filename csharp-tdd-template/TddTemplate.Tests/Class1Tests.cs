using Xunit;

namespace TddTemplate.Tests
{
    public class Class1Tests
    {
        [Fact]
        public void FailingTest()
        {
            var underTest = new Class1();
            Assert.True(false, "I'm a failing test!");
        }

        [Fact]
        public void PassingTest()
        {
            Assert.True(true, "I'm a passing test!");
        }
    }
}