# Grafana RS Demo

## Demo Project using https://play.grafana.org/d/000000063/prometheus-templating?orgId=1&viewPanel=4

### Enviroment Variables

- TEST_RUN_TIME - Test Duration (in seconds), defaults to 300, set it with EXPORT TEST_RUN_TIME="amount of time"
- VU_COUNT - Number of threads (users), defaults to 1, set it with EXPORT VU_COUNT="number of vus"

### Additional variables

- Some variables are set at a project level
- Additional values are set on cvs within the csv folder

### Scripts

- More complex logic is stored in external Groovy scripts within the scripts folder
- Simpler scripts are either set inline or within pre / pro processor logic

### CLI Execution
- Execute tests: jmeter -n -t ./rs-grafana-demo.jmx -l report.csv
- Generate html report: jmeter -g ./report.csv -o ./report.html