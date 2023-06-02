import java.time.LocalDateTime;

def pastTime =
        LocalDateTime.now().minusHours(args[0].toInteger()).toDate() - args[1].toInteger()

if (pastTime[Calendar.DAY_OF_WEEK] == Calendar.SATURDAY || Calendar.SUNDAY) {

    pastTime + 1

    if (pastTime[Calendar.DAY_OF_WEEK] == Calendar.SATURDAY || Calendar.SUNDAY) {
        pastTime + 2
    }
}

vars.put("PRESENT_TIME", vars.get("PAST_TIME"))
vars.put("PAST_TIME", pastTime.getTime().toString()[0..-4])
vars.put("TIME_RANGE_RAW_FORMAT", args[2])