tasks.register("printenv") {
    doLast {
        val builder = ProcessBuilder(listOf("env")).redirectErrorStream(true)
        val process = builder.start()
        process.inputStream.transferTo(System.out)
        process.waitFor()
    }
}

tasks.register("printenv2") {
    doLast {
        val builder = ProcessBuilder(listOf("env")).redirectErrorStream(true)
        builder.environment()
        val process = builder.start()
        process.inputStream.transferTo(System.out)
        process.waitFor()
    }
}
