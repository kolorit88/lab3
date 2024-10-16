public class SecondTask {
    public static void secondTask() {
        PrimesGenerator primes = new PrimesGenerator(100);
        new PrimesGeneratorTest(primes).test(100);
    }
}
