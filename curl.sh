curl -v "http://localhost:8088/api/add?vorname=Karl&nachname=Maier"
curl -v "http://localhost:8088/api/add?vorname=Sabine&nachname=Huber"
curl -v "http://localhost:8088/api/add?vorname=Martin&nachname=Bauer"
curl -v "http://localhost:8088/api/add?vorname=Hubert&nachname=Staller"
curl -v "http://localhost:8088/api/add?vorname=Babsi&nachname=Müller"
curl -v http://localhost:8088/api/kunden

curl http://localhost:8088/api/person/find?id=1

curl -X POST http://localhost:8088/api/person/add -H "Content-Type: application/json" -d '{"firstName":"Karl","lastName":"Gruber"}'