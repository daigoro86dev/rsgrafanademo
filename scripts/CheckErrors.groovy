vars.put("STATUS_CODE",prev.getResponseCode());
if (vars.get("STATUS_CODE") != "200")
{
    def errorCount = vars.get("ERROR_COUNT") as int;
    errorCount = errorCount + 1;
    vars.put("ERROR_COUNT", String.valueOf(errorCount));
}