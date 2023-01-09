# TUSOM

## Inicio
### Proyecto entre amigos como servicio que ayuda a conectar comidas con el vino adecuado.


# see Releases for other versions
URL="https://storage.googleapis.com/cloud-sql-connectors/cloud-sql-proxy/v2.0.0-preview.3"

wget "$URL/cloud-sql-proxy.linux.amd64" -O cloud-sql-proxy

chmod +x cloud-sql-proxy

cloud_sql_proxy -instances=tusom-01:us-central1:tusom-db=tcp:5432