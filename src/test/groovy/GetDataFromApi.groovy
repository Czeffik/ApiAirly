import api.ApiClient
import model.Sensor

ApiClient apiClient = new ApiClient()
List<Sensor> listWithSensors = apiClient.getSensors()
List<Sensor> listWithSensorsWithPollutionLevel0 =  apiClient.getListWithPollutionLevel(listWithSensors, 0)
List<Sensor> listWithSensorsWithPollutionLevel1 = apiClient.getListWithPollutionLevel(listWithSensors, 1)
List<Sensor> listWithSensorsWithPollutionLevel2 = apiClient.getListWithPollutionLevel(listWithSensors, 2)
List<Sensor> listWithSensorsWithPollutionLevel3 = apiClient.getListWithPollutionLevel(listWithSensors, 3)
List<Sensor> listWithSensorsWithPollutionLevel4 = apiClient.getListWithPollutionLevel(listWithSensors,4)
List<Sensor> listWithSensorsWithPollutionLevel5 = apiClient.getListWithPollutionLevel(listWithSensors,5)
List<Sensor> listWithSensorsWithPollutionLevel6 = apiClient.getListWithPollutionLevel(listWithSensors,6)

println('Wszystkie sensory: '+listWithSensors.size())
println('Poziom zanieczyszczeń - brak danych?!?!?!: '+listWithSensorsWithPollutionLevel0.size())
println('Poziom zanieczyszczeń - bardzo niski: '+listWithSensorsWithPollutionLevel1.size())
println('Poziom zanieczyszczeń - niski: '+listWithSensorsWithPollutionLevel2.size())
println('Poziom zanieczyszczeń - średni: '+listWithSensorsWithPollutionLevel3.size())
println('Poziom zanieczyszczeń - wysoki: '+listWithSensorsWithPollutionLevel4.size())
println('Poziom zanieczyszczeń - bardzo wysoki: '+listWithSensorsWithPollutionLevel5.size())
println('Poziom zanieczyszczeń - ekstremalny: '+listWithSensorsWithPollutionLevel6.size())
//int sum = listWithSensorsWithPollutionLevel0.size() + listWithSensorsWithPollutionLevel1.size() + listWithSensorsWithPollutionLevel2.size() + listWithSensorsWithPollutionLevel3.size() + listWithSensorsWithPollutionLevel4.size() + listWithSensorsWithPollutionLevel5.size()+listWithSensorsWithPollutionLevel6.size()
//print('Suma wszystkich sensorów: ' + sum)

List<Sensor> list = new ArrayList<>()
for (Sensor sensor in listWithSensors){
    if (sensor.getVendor()=='Airly'){
        list<<sensor
    }
}
println "liczba sensorów airly:   " + list.size()










