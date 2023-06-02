if (vars.get("JMeterThread.last_sample_ok") == "false") {
    def errorCount = vars.get("ERROR_COUNT") as int;
    errorCount = errorCount + 1;

    vars.put("ERROR_COUNT", String.valueOf(errorCount));
    vars.put("STATUS", "ERROR");
    log.info(vars.get("ERROR_COUNT"))
} else {
    log.info(vars.get("STATUS"))
    vars.put("STATUS", "OK");
}