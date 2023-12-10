import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class MyFirstTestClass : FunSpec({
extension(RepeatOnFailureExtension())
    test("my first test") {
        1 + 2 shouldBe 3
    }

    test("my second test") {
        1 + 2 shouldBe 5
    }

    test("my third test") {
        2 + 2 shouldBe 4
    }
})