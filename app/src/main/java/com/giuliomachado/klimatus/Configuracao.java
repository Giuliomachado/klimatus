package com.giuliomachado.klimatus;

public class Configuracao {

    //Endereços dos scripts para fazer o CRUD
    public static final String URL_ADICIONAR = "";
    public static final String URL_GET_TODAS_CIDADES = "";
    public static final String URL_GET_CIDADE = "";
    public static final String URL_ATUALIZAR_CIDADE = "";
    public static final String URL_APAGAR_CIDADE = "";

    //Constantes chave que serão utilizados para enviar dados para os scripts PHP
    public static final String KEY_CID_ID = "id";
    public static final String KEY_CID_NOME = "nome"; //Nome cidade

    //Tags JSON
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID_CIDADE = "id";

    //PÁGINA PRINCIPAL
    //Welcome
    public static final String TAG_ICON_COD = "icone_cod";
    public static final String TAG_TEMP = "temperatura";
    public static final String TAG_CITY = "cidade";
    public static final String TAG_CONDITION_SLUG = "slug";
    public static final String TAG_HUMIDITY = "umidade";
    public static final String TAG_CORRENTLY = "periodo";
    public static final String TAG_TIME = "horario";
    public static final String TAG_WEEKDAY = "dia_semana";
    //Previsão do dia
    public static final String TAG_MAX = "temp_max";
    public static final String TAG_MIN = "temp_min";
    public static final String TAG_WIND_SPEEDY = "vento";
    public static final String TAG_SUNRISE = "nascer_sol";
    public static final String TAG_SUNSET = "por_sol";
    public static final String TAG_DESCRIPTION = "descricao";
    //Próximos dias
    public static final String TAG_FORECAST_DATE = "data";
    public static final String TAG_FORECAST_WEEKDAY = "dia_semana_forecast";
    public static final String TAG_FORECAST_MAX = "temp_max_forecast";
    public static final String TAG_FORECAST_MIN = "temp_min_forecast";
    public static final String TAG_FORECAST_DESCRIPTION = "descricao_forecast";


    //ID que será passado via intent
    public static final String ID_CIDADE = "id_cidade";
    public static final String ICON_COD = "icone_cod";
    public static final String TEMP = "temperatura";
    public static final String CITY = "cidade";
    public static final String CONDITION_SLUG = "slug";
    public static final String HUMIDITY = "umidade";
    public static final String CORRENTLY = "periodo";
    public static final String TIME = "horario";
    public static final String WEEKDAY = "dia_semana";
    public static final String MAX = "temp_max";
    public static final String MIN = "temp_min";
    public static final String WIND_SPEEDY = "vento";
    public static final String SUNRISE = "nascer_sol";
    public static final String SUNSET = "por_sol";
    public static final String DESCRIPTION = "descricao";
    public static final String FORECAST_DATE = "data";
    public static final String FORECAST_WEEKDAY = "dia_semana_forecast";
    public static final String FORECAST_MAX = "temp_max_forecast";
    public static final String FORECAST_MIN = "temp_min_forecast";
    public static final String FORECAST_DESCRIPTION = "descricao_forecast";


}
