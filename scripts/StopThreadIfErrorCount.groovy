int errorCount = Integer.parseInt(vars.get("errorCount"));
int restartLimit = Integer.parseInt(vars.get("restartTimes"));

//if (errorCount == restartLimit) {
//    JMeterContextService.getContext().getThread().stop();
//}

https://${BASE_URL}/d/${DAHSBOARD_UID}/prometheus-templating?orgId=1&viewPanel=4&var-jobs=alertmanager&var-jobs=node&var-jobs=prometheus&var-disk_series=${nodes}&var-query=up%7Benv%3D%22demo%22,instance%3D%22demo.do.prometheus.io:9093%22,job%3D%22alertmanager%22%7D%201%201685267435000&var-instance=demo.do.prometheus.io:${instances}&var-instance2=demo.do.prometheus.io:9093&var-last=alertmanager