import org.apache.jmeter.services.FileServer;

def inputFile = new File(FileServer.getFileServer().getBaseDir() + "/csvs/disk_series.csv")
def lineCount = inputFile.readLines().size()

vars.put("amountOfDiskNodes", lineCount.toInteger())

