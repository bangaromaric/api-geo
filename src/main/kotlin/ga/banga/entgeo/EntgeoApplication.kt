package ga.banga.entgeo

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.entities.TypeEntGeo
import ga.banga.entgeo.services.IServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment

@SpringBootApplication
class EntgeoApplication : CommandLineRunner {

    @Autowired
    lateinit var iServices: IServices

    @Autowired
    lateinit var environment: Environment

    private lateinit var paysTypeEngeo: TypeEntGeo
    private lateinit var provinceTypeEngeo: TypeEntGeo
    private lateinit var departementTypeEngeo: TypeEntGeo
    private lateinit var villeTypeEngeo: TypeEntGeo
    private lateinit var entGeoLbv: EntGeo

    override fun run(vararg args: String?) {

        val prof = environment.activeProfiles
        if (prof[0] == "dev") {
            insertTypeEntGeo()
            insertEntGeo()
        }


    }

    private fun insertTypeEntGeo() {
        paysTypeEngeo = iServices.insertTypeEntGeo(TypeEntGeo(nom = "Pays"))
        provinceTypeEngeo = iServices.insertTypeEntGeo(TypeEntGeo(nom = "Province"))
        departementTypeEngeo = iServices.insertTypeEntGeo(TypeEntGeo(nom = "Département"))
        villeTypeEngeo = iServices.insertTypeEntGeo(TypeEntGeo(nom = "Ville"))
    }


    private fun insertEntGeo() {

//pays
        val afghanistanEntGeo = iServices.insertEntGeo(EntGeo(nom = "Afghanistan", typeEntGeo= paysTypeEngeo))
        val afriqueDuSudEntGeo = iServices.insertEntGeo(EntGeo(nom = "Afrique du Sud", typeEntGeo= paysTypeEngeo))
        val albanieEntGeo = iServices.insertEntGeo( EntGeo(nom = "Albanie", typeEntGeo= paysTypeEngeo))
        val algerieEntGeo = iServices.insertEntGeo( EntGeo(nom = "Algérie", typeEntGeo= paysTypeEngeo))
        val allemagneEntGeo = iServices.insertEntGeo( EntGeo(nom ="Allemagne",  typeEntGeo= paysTypeEngeo))
        val andorreEntGeo = iServices.insertEntGeo( EntGeo(nom ="Andorre", typeEntGeo= paysTypeEngeo))
        val angolaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Angola", typeEntGeo= paysTypeEngeo))
        val anguillaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Anguilla", typeEntGeo= paysTypeEngeo))
        val antiguaBarbudaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Antigua-et-Barbuda", typeEntGeo= paysTypeEngeo))
        val arabieSaouditeEntGeo = iServices.insertEntGeo( EntGeo(nom ="Arabie Saoudite", typeEntGeo= paysTypeEngeo))
        val argentineEntGeo = iServices.insertEntGeo( EntGeo(nom ="Argentine", typeEntGeo= paysTypeEngeo))
        val armenieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Arménie",typeEntGeo= paysTypeEngeo))
        val arubaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Aruba", typeEntGeo= paysTypeEngeo))
        val australieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Australie", typeEntGeo= paysTypeEngeo))
        val autricheEntGeo = iServices.insertEntGeo( EntGeo(nom ="Autriche", typeEntGeo= paysTypeEngeo))
        val azerbaidjanEntGeo = iServices.insertEntGeo( EntGeo(nom ="Azerbaïdjan", typeEntGeo= paysTypeEngeo))
        val bahamasEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bahamas", typeEntGeo= paysTypeEngeo))
        val BahreinEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bahreïn", typeEntGeo= paysTypeEngeo))
        val bangladeshEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bangladesh", typeEntGeo= paysTypeEngeo))
        val barbadeEntGeo = iServices.insertEntGeo( EntGeo(nom ="Barbade", typeEntGeo= paysTypeEngeo))
        val belgiqueEntGeo = iServices.insertEntGeo( EntGeo(nom ="Belgique", typeEntGeo= paysTypeEngeo))
        val belizeEntGeo = iServices.insertEntGeo( EntGeo(nom ="Belize", typeEntGeo= paysTypeEngeo))
        val beninEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bénin", typeEntGeo= paysTypeEngeo))
        val bermudesEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bermudes", typeEntGeo= paysTypeEngeo))
        val bhoutanEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bhoutan", typeEntGeo= paysTypeEngeo))
        val bielorussieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Biélorussie", typeEntGeo= paysTypeEngeo))
        val bolivieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bolivie",typeEntGeo= paysTypeEngeo))
        val bosnieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bosnie-Herzégovine", typeEntGeo= paysTypeEngeo))
        val botswanaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Botswana", typeEntGeo= paysTypeEngeo))
        val bresilEntGeo = iServices.insertEntGeo( EntGeo(nom ="Brésil", typeEntGeo= paysTypeEngeo))
        val bruneiEntGeo = iServices.insertEntGeo( EntGeo(nom ="Brunéi", typeEntGeo= paysTypeEngeo))
        val bulgarieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Bulgarie", typeEntGeo= paysTypeEngeo))
        val burkinaFasoEntGeo = iServices.insertEntGeo( EntGeo(nom ="Burkina Faso", typeEntGeo= paysTypeEngeo))
        val burundiEntGeo = iServices.insertEntGeo( EntGeo(nom ="Burundi",  typeEntGeo= paysTypeEngeo))
        val cambodgeEntGeo = iServices.insertEntGeo( EntGeo(nom ="Cambodge",  typeEntGeo= paysTypeEngeo))
        val camerounEntGeo = iServices.insertEntGeo( EntGeo(nom ="Cameroun", typeEntGeo= paysTypeEngeo))
        val canadaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Canada", typeEntGeo= paysTypeEngeo))
        val capVertEntGeo = iServices.insertEntGeo( EntGeo(nom ="Cap-vert", typeEntGeo= paysTypeEngeo))
        val centrafriqueEntGeo = iServices.insertEntGeo( EntGeo(nom ="Centrafrique", typeEntGeo= paysTypeEngeo))
        val chiliEntGeo = iServices.insertEntGeo( EntGeo(nom ="Chili", typeEntGeo= paysTypeEngeo))
        val chineEntGeo = iServices.insertEntGeo( EntGeo(nom ="Chine", typeEntGeo= paysTypeEngeo))
        val chyprenEntGeo = iServices.insertEntGeo( EntGeo(nom ="Chypre", typeEntGeo= paysTypeEngeo))
        val colombieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Colombie", typeEntGeo= paysTypeEngeo))
        val comoresEntGeo = iServices.insertEntGeo( EntGeo(nom ="Comores", typeEntGeo= paysTypeEngeo))
        val coreeDuNordEntGeo = iServices.insertEntGeo( EntGeo(nom ="Corée du Nord", typeEntGeo= paysTypeEngeo))
        val coreeDuSudEntGeo = iServices.insertEntGeo( EntGeo(nom ="Corée du Sud", typeEntGeo= paysTypeEngeo))
        val costaRicaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Costa Rica", typeEntGeo= paysTypeEngeo))
        val coteDivoireEntGeo = iServices.insertEntGeo( EntGeo(nom ="Côte d'Ivoire", typeEntGeo= paysTypeEngeo))
        val croatieEntGeo = iServices.insertEntGeo( EntGeo(nom="Croatie", typeEntGeo= paysTypeEngeo))
        val cubaEntGeo = iServices.insertEntGeo( EntGeo(nom="Cuba", typeEntGeo= paysTypeEngeo))
        val danemarkEntGeo = iServices.insertEntGeo( EntGeo(nom="Danemark", typeEntGeo= paysTypeEngeo))
        val djiboutiEntGeo = iServices.insertEntGeo( EntGeo(nom="Djibouti", typeEntGeo= paysTypeEngeo))
        val dominiqueEntGeo = iServices.insertEntGeo( EntGeo(nom="Dominique", typeEntGeo= paysTypeEngeo))
        val egypteEntGeo = iServices.insertEntGeo( EntGeo(nom="Égypte", typeEntGeo= paysTypeEngeo))
        val elSalvadorEntGeo = iServices.insertEntGeo( EntGeo(nom="El Salvador", typeEntGeo= paysTypeEngeo))
        val emiratsAraEntGeo = iServices.insertEntGeo( EntGeo(nom="Émirats Arabes Unis", typeEntGeo= paysTypeEngeo))
        val equateurEntGeo = iServices.insertEntGeo( EntGeo(nom="Équateur", typeEntGeo= paysTypeEngeo))
        val erythreeEntGeo = iServices.insertEntGeo( EntGeo(nom="Érythrée", typeEntGeo= paysTypeEngeo))
        val espagneEntGeo = iServices.insertEntGeo( EntGeo(nom="Espagne", typeEntGeo= paysTypeEngeo))
        val estonieEntGeo = iServices.insertEntGeo( EntGeo(nom="Estonie", typeEntGeo= paysTypeEngeo))
        val etetsFedeMicroEntGeo = iServices.insertEntGeo( EntGeo(nom="États Fédérés de Micronésie", typeEntGeo= paysTypeEngeo))
        val etatsUnisEntGeo = iServices.insertEntGeo( EntGeo(nom="États-Unis", typeEntGeo= paysTypeEngeo))
        val ethiopieEntGeo = iServices.insertEntGeo( EntGeo(nom="Éthiopie", typeEntGeo= paysTypeEngeo))
        val russieEntGeo = iServices.insertEntGeo( EntGeo(nom="Russie", typeEntGeo= paysTypeEngeo))
        val fidjiEntGeo = iServices.insertEntGeo( EntGeo(nom="Fidji", typeEntGeo= paysTypeEngeo))
        val finlandeEntGeo = iServices.insertEntGeo( EntGeo(nom="Finlande", typeEntGeo= paysTypeEngeo))
        val franceEntGeo = iServices.insertEntGeo( EntGeo(nom="France", typeEntGeo= paysTypeEngeo))
        val gabonEntGeo = iServices.insertEntGeo( EntGeo(nom="Gabon", typeEntGeo= paysTypeEngeo))
        val gambieEntGeo = iServices.insertEntGeo( EntGeo(nom="Gambie", typeEntGeo= paysTypeEngeo))
        val georgieEntGeo = iServices.insertEntGeo( EntGeo(nom="Géorgie", typeEntGeo= paysTypeEngeo))
        val ghanaEntGeo = iServices.insertEntGeo( EntGeo(nom="Ghana", typeEntGeo= paysTypeEngeo))
        val gibraltarEntGeo = iServices.insertEntGeo( EntGeo(nom="Gibraltar", typeEntGeo= paysTypeEngeo))
        val greceEntGeo = iServices.insertEntGeo( EntGeo(nom="Grèce", typeEntGeo= paysTypeEngeo))
        val grenadeEntGeo = iServices.insertEntGeo( EntGeo(nom="Grenade", typeEntGeo= paysTypeEngeo))
        val guatemalaEntGeo = iServices.insertEntGeo( EntGeo(nom="Guatemala", typeEntGeo= paysTypeEngeo))
        val guineeEntGeo = iServices.insertEntGeo( EntGeo(nom="Guinée", typeEntGeo= paysTypeEngeo))
        val guineeEquatorialeEntGeo = iServices.insertEntGeo( EntGeo(nom="Guinée Équatoriale", typeEntGeo= paysTypeEngeo))
        val guineeBissauEntGeo = iServices.insertEntGeo( EntGeo(nom="Guinée-Bissau", typeEntGeo= paysTypeEngeo))
        val guyanaEntGeo = iServices.insertEntGeo( EntGeo(nom="Guyana", typeEntGeo= paysTypeEngeo))
        val haitiEntGeo = iServices.insertEntGeo( EntGeo(nom="Haïti", typeEntGeo= paysTypeEngeo))
        val hondurasEntGeo = iServices.insertEntGeo( EntGeo(nom="Honduras", typeEntGeo= paysTypeEngeo))
        val hongrieEntGeo = iServices.insertEntGeo( EntGeo(nom="Hongrie", typeEntGeo= paysTypeEngeo))
        val ileDeManEntGeo = iServices.insertEntGeo( EntGeo(nom="Île de Man", typeEntGeo= paysTypeEngeo))
        val ilesCookEntGeo = iServices.insertEntGeo( EntGeo(nom="Îles Cook", typeEntGeo= paysTypeEngeo))
        val ilesMarshallEntGeo = iServices.insertEntGeo( EntGeo(nom="Îles Marshall", typeEntGeo= paysTypeEngeo))
        val ilesSalomonEntGeo = iServices.insertEntGeo( EntGeo(nom="Îles Salomon", typeEntGeo= paysTypeEngeo))
        val indeEntGeo = iServices.insertEntGeo( EntGeo(nom="Inde", typeEntGeo= paysTypeEngeo))
        val indonesieEntGeo = iServices.insertEntGeo( EntGeo(nom="Indonésie", typeEntGeo= paysTypeEngeo))
        val iranEntGeo = iServices.insertEntGeo( EntGeo(nom="Iran", typeEntGeo= paysTypeEngeo))
        val iraqEntGeo = iServices.insertEntGeo( EntGeo(nom="Iraq", typeEntGeo= paysTypeEngeo))
        val irlandeEntGeo = iServices.insertEntGeo( EntGeo(nom="Irlande", typeEntGeo= paysTypeEngeo))
        val islandeEntGeo = iServices.insertEntGeo( EntGeo(nom="Islande", typeEntGeo= paysTypeEngeo))
        val israelEntGeo = iServices.insertEntGeo( EntGeo(nom="Israël", typeEntGeo= paysTypeEngeo))
        val italieEntGeo = iServices.insertEntGeo( EntGeo(nom="Italie", typeEntGeo= paysTypeEngeo))
        val jamaiquenEntGeo = iServices.insertEntGeo( EntGeo(nom="Jamaïque", typeEntGeo= paysTypeEngeo))
        val japonEntGeo = iServices.insertEntGeo( EntGeo(nom="Japon", typeEntGeo= paysTypeEngeo))
        val jordanieEntGeo = iServices.insertEntGeo( EntGeo(nom="Jordanie", typeEntGeo= paysTypeEngeo))
        val kazakhstanEntGeo = iServices.insertEntGeo( EntGeo(nom="Kazakhstan", typeEntGeo= paysTypeEngeo))
        val kenyaEntGeo = iServices.insertEntGeo( EntGeo(nom="Kenya", typeEntGeo= paysTypeEngeo))
        val kirghizistanEntGeo = iServices.insertEntGeo( EntGeo(nom="Kirghizistan", typeEntGeo= paysTypeEngeo))
        val kiribatiEntGeo = iServices.insertEntGeo( EntGeo(nom="Kiribati", typeEntGeo= paysTypeEngeo))
        val koweitEntGeo = iServices.insertEntGeo( EntGeo(nom="Koweït", typeEntGeo= paysTypeEngeo))
        val macedoineEntGeo = iServices.insertEntGeo( EntGeo(nom="Macédoine", typeEntGeo= paysTypeEngeo))
        val laosEntGeo = iServices.insertEntGeo( EntGeo(nom="Laos", typeEntGeo= paysTypeEngeo))
        val lesothoEntGeo = iServices.insertEntGeo( EntGeo(nom="Lesotho", typeEntGeo= paysTypeEngeo))
        val lettonieEntGeo = iServices.insertEntGeo( EntGeo(nom="Lettonie", typeEntGeo= paysTypeEngeo))
        val libanEntGeo = iServices.insertEntGeo( EntGeo(nom="Liban", typeEntGeo= paysTypeEngeo))
        val liberiaEntGeo = iServices.insertEntGeo( EntGeo(nom="Libéria", typeEntGeo= paysTypeEngeo))
        val libyeEntGeo = iServices.insertEntGeo( EntGeo(nom="Libye", typeEntGeo= paysTypeEngeo))
        val liechtensteinEntGeo = iServices.insertEntGeo( EntGeo(nom="Liechtenstein", typeEntGeo= paysTypeEngeo))
        val lituanieEntGeo = iServices.insertEntGeo( EntGeo(nom="Lituanie", typeEntGeo= paysTypeEngeo))
        val luxembourgEntGeo = iServices.insertEntGeo( EntGeo(nom="Luxembourg", typeEntGeo= paysTypeEngeo))
        val madagascarEntGeo = iServices.insertEntGeo( EntGeo(nom="Madagascar", typeEntGeo= paysTypeEngeo))
        val malaisieEntGeo = iServices.insertEntGeo( EntGeo(nom="Malaisie", typeEntGeo= paysTypeEngeo))
        val malawiEntGeo = iServices.insertEntGeo( EntGeo(nom="Malawi", typeEntGeo= paysTypeEngeo))
        val maldivesEntGeo = iServices.insertEntGeo( EntGeo(nom="Maldives", typeEntGeo= paysTypeEngeo))
        val maliEntGeo = iServices.insertEntGeo( EntGeo(nom="Mali", typeEntGeo= paysTypeEngeo))
        val malteEntGeo = iServices.insertEntGeo( EntGeo(nom="Malte", typeEntGeo= paysTypeEngeo))
        val marocEntGeo = iServices.insertEntGeo( EntGeo(nom="Maroc", typeEntGeo= paysTypeEngeo))
        val mauriceEntGeo = iServices.insertEntGeo( EntGeo(nom="Maurice", typeEntGeo= paysTypeEngeo))
        val mauritanieEntGeo = iServices.insertEntGeo( EntGeo(nom="Mauritanie", typeEntGeo= paysTypeEngeo))
        val mexiqueEntGeo = iServices.insertEntGeo( EntGeo(nom="Mexique", typeEntGeo= paysTypeEngeo))
        val montenegroEntGeo = iServices.insertEntGeo( EntGeo(nom="Monténégro", typeEntGeo= paysTypeEngeo))
        val moldavieEntGeo = iServices.insertEntGeo( EntGeo(nom="Moldavie", typeEntGeo= paysTypeEngeo))
        val monacoEntGeo = iServices.insertEntGeo( EntGeo(nom="Monaco", typeEntGeo= paysTypeEngeo))
        val mongolieEntGeo = iServices.insertEntGeo( EntGeo(nom="Mongolie", typeEntGeo= paysTypeEngeo))
        val mozambiqueEntGeo = iServices.insertEntGeo( EntGeo(nom="Mozambique", typeEntGeo= paysTypeEngeo))
        val myanmarEntGeo = iServices.insertEntGeo( EntGeo(nom="Myanmar", typeEntGeo= paysTypeEngeo))
        val namibieEntGeo = iServices.insertEntGeo( EntGeo(nom="Namibie", typeEntGeo= paysTypeEngeo))
        val nauruEntGeo = iServices.insertEntGeo( EntGeo(nom="Nauru", typeEntGeo= paysTypeEngeo))
        val nepalEntGeo = iServices.insertEntGeo( EntGeo(nom="Népal", typeEntGeo= paysTypeEngeo))
        val nicaraguaEntGeo = iServices.insertEntGeo( EntGeo(nom="Nicaragua", typeEntGeo= paysTypeEngeo))
        val nigerEntGeo = iServices.insertEntGeo( EntGeo(nom="Niger", typeEntGeo= paysTypeEngeo))
        val nigeriaEntGeo = iServices.insertEntGeo( EntGeo(nom="Nigéria", typeEntGeo= paysTypeEngeo))
        val niueEntGeo = iServices.insertEntGeo( EntGeo(nom="Niué", typeEntGeo= paysTypeEngeo))
        val norvegeEntGeo = iServices.insertEntGeo( EntGeo(nom="Norvège", typeEntGeo= paysTypeEngeo))
        val nouvelleZelandeEntGeo = iServices.insertEntGeo( EntGeo(nom="Nouvelle-Zélande", typeEntGeo= paysTypeEngeo))
        val omanEntGeo = iServices.insertEntGeo( EntGeo(nom="Oman", typeEntGeo= paysTypeEngeo))
        val ougandaEntGeo = iServices.insertEntGeo( EntGeo(nom="Ouganda", typeEntGeo= paysTypeEngeo))
        val ouzbekistanEntGeo = iServices.insertEntGeo( EntGeo(nom="Ouzbékistan", typeEntGeo= paysTypeEngeo))
        val pakistanEntGeo = iServices.insertEntGeo( EntGeo(nom="Pakistan", typeEntGeo= paysTypeEngeo))
        val palaosEntGeo = iServices.insertEntGeo( EntGeo(nom="Palaos", typeEntGeo= paysTypeEngeo))
        val panamaEntGeo = iServices.insertEntGeo( EntGeo(nom="Panama", typeEntGeo= paysTypeEngeo))
        val papouasieEntGeo = iServices.insertEntGeo( EntGeo(nom="Papouasie-Nouvelle-Guinée", typeEntGeo= paysTypeEngeo))
        val paraguayEntGeo = iServices.insertEntGeo( EntGeo(nom="Paraguay", typeEntGeo= paysTypeEngeo))
        val paysBasEntGeo = iServices.insertEntGeo( EntGeo(nom="Pays-Bas", typeEntGeo= paysTypeEngeo))
        val perouEntGeo = iServices.insertEntGeo( EntGeo(nom="Pérou", typeEntGeo= paysTypeEngeo))
        val philippinesEntGeo = iServices.insertEntGeo( EntGeo(nom="Philippines", typeEntGeo= paysTypeEngeo))
        val pologneEntGeo = iServices.insertEntGeo( EntGeo(nom="Pologne", typeEntGeo= paysTypeEngeo))
        val portoRicoEntGeo = iServices.insertEntGeo( EntGeo(nom="Porto Rico", typeEntGeo= paysTypeEngeo))
        val portugalEntGeo = iServices.insertEntGeo( EntGeo(nom="Portugal", typeEntGeo= paysTypeEngeo))
        val qatarEntGeo = iServices.insertEntGeo( EntGeo(nom="Qatar", typeEntGeo= paysTypeEngeo))
        val congoDRCEntGeo = iServices.insertEntGeo( EntGeo(nom="République Démocratique du Congo", typeEntGeo= paysTypeEngeo))
        val repubDominiEntGeo = iServices.insertEntGeo( EntGeo(nom="République Dominicaine", typeEntGeo= paysTypeEngeo))
        val congoEntGeo = iServices.insertEntGeo( EntGeo(nom="République du Congo", typeEntGeo= paysTypeEngeo))
        val tchequeEntGeo = iServices.insertEntGeo( EntGeo(nom="République Tchèque", typeEntGeo= paysTypeEngeo))
        val roumanieEntGeo = iServices.insertEntGeo( EntGeo(nom="Roumanie", typeEntGeo= paysTypeEngeo))
        val royaumeUniEntGeo = iServices.insertEntGeo( EntGeo(nom="Royaume-Uni", typeEntGeo= paysTypeEngeo))
        val rwandaEntGeo = iServices.insertEntGeo( EntGeo(nom="Rwanda", typeEntGeo= paysTypeEngeo))
        val saintKittsEntGeo = iServices.insertEntGeo( EntGeo(nom="Saint-Kitts-et-Nevis", typeEntGeo= paysTypeEngeo))
        val saintMartinEntGeo = iServices.insertEntGeo( EntGeo(nom="Saint-Marin", typeEntGeo= paysTypeEngeo))
        val saintVincenEntGeo = iServices.insertEntGeo( EntGeo(nom="Saint-Vincent-et-les Grenadines", typeEntGeo= paysTypeEngeo))
        val saintLucieEntGeo = iServices.insertEntGeo( EntGeo(nom="Sainte-Lucie", typeEntGeo= paysTypeEngeo))
        val samoaEntGeo = iServices.insertEntGeo( EntGeo(nom="Samoa", typeEntGeo= paysTypeEngeo))
        val saoTomeEntGeo = iServices.insertEntGeo( EntGeo(nom="Sao Tomé-et-Principe", typeEntGeo= paysTypeEngeo))
        val senegalEntGeo = iServices.insertEntGeo( EntGeo(nom="Sénégal", typeEntGeo= paysTypeEngeo))
        val serbieEntGeo = iServices.insertEntGeo( EntGeo(nom="Serbie", typeEntGeo= paysTypeEngeo))
        val seychellesEntGeo = iServices.insertEntGeo( EntGeo(nom="Seychelles", typeEntGeo= paysTypeEngeo))
        val sierraLeoneEntGeo = iServices.insertEntGeo( EntGeo(nom="Sierra Leone", typeEntGeo= paysTypeEngeo))
        val singapourEntGeo = iServices.insertEntGeo( EntGeo(nom="Singapour", typeEntGeo= paysTypeEngeo))
        val slovaquieEntGeo = iServices.insertEntGeo( EntGeo(nom="Slovaquie", typeEntGeo= paysTypeEngeo))
        val slovenieEntGeo = iServices.insertEntGeo( EntGeo(nom="Slovénie", typeEntGeo= paysTypeEngeo))
        val somalieEntGeo = iServices.insertEntGeo( EntGeo(nom="Somalie", typeEntGeo= paysTypeEngeo))
        val soudanDuSudEntGeo = iServices.insertEntGeo( EntGeo(nom="Soudan du Sud", typeEntGeo= paysTypeEngeo))
        val soudanEntGeo = iServices.insertEntGeo( EntGeo(nom="Soudan", typeEntGeo= paysTypeEngeo))
        val sriLankaEntGeo = iServices.insertEntGeo( EntGeo(nom="Sri Lanka", typeEntGeo= paysTypeEngeo))
        val suedeEntGeo = iServices.insertEntGeo( EntGeo(nom="Suède", typeEntGeo= paysTypeEngeo))
        val suisseEntGeo = iServices.insertEntGeo( EntGeo(nom="Suisse", typeEntGeo= paysTypeEngeo))
        val surinameEntGeo = iServices.insertEntGeo( EntGeo(nom="Suriname", typeEntGeo= paysTypeEngeo))
        val swazilandEntGeo = iServices.insertEntGeo( EntGeo(nom="Swaziland", typeEntGeo= paysTypeEngeo))
        val syrieEntGeo = iServices.insertEntGeo( EntGeo(nom="Syrie", typeEntGeo= paysTypeEngeo))
        val tadjikistanEntGeo = iServices.insertEntGeo( EntGeo(nom="Tadjikistan", typeEntGeo= paysTypeEngeo))
        val taiwanEntGeo = iServices.insertEntGeo( EntGeo(nom="Taïwan", typeEntGeo= paysTypeEngeo))
        val tanzanieEntGeo = iServices.insertEntGeo( EntGeo(nom="Tanzanie", typeEntGeo= paysTypeEngeo))
        val tchadEntGeo = iServices.insertEntGeo( EntGeo(nom="Tchad", typeEntGeo= paysTypeEngeo))
        val territoirePalestinienOccupeEntGeo = iServices.insertEntGeo( EntGeo(nom="Territoire Palestinien Occupé", typeEntGeo= paysTypeEngeo))
        val ThailandeEntGeo = iServices.insertEntGeo( EntGeo(nom="Thaïlande", typeEntGeo= paysTypeEngeo))
        val timorLesteEntGeo = iServices.insertEntGeo( EntGeo(nom="Timor-Leste", typeEntGeo= paysTypeEngeo))
        val togoEntGeo = iServices.insertEntGeo( EntGeo(nom="Togo", typeEntGeo= paysTypeEngeo))
        val tongaEntGeo = iServices.insertEntGeo( EntGeo(nom="Tonga", typeEntGeo= paysTypeEngeo))
        val triniteEntGeo = iServices.insertEntGeo( EntGeo(nom="Trinité-et-Tobago", typeEntGeo= paysTypeEngeo))
        val tunisieEntGeo = iServices.insertEntGeo( EntGeo(nom="Tunisie", typeEntGeo= paysTypeEngeo))
        val turkmenistanEntGeo = iServices.insertEntGeo( EntGeo(nom="Turkménistan", typeEntGeo= paysTypeEngeo))
        val turquieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Turquie", typeEntGeo= paysTypeEngeo))
        val tuvaluEntGeo = iServices.insertEntGeo( EntGeo(nom ="Tuvalu", typeEntGeo= paysTypeEngeo))
        val ukraineEntGeo = iServices.insertEntGeo( EntGeo(nom ="Ukraine", typeEntGeo= paysTypeEngeo))
        val uruguayEntGeo = iServices.insertEntGeo( EntGeo(nom ="Uruguay", typeEntGeo= paysTypeEngeo))
        val vanuatuEntGeo = iServices.insertEntGeo( EntGeo(nom ="Vanuatu", typeEntGeo= paysTypeEngeo))
        val vaticanEntGeo = iServices.insertEntGeo( EntGeo(nom ="Vatican", typeEntGeo= paysTypeEngeo))
        val venezuelaEntGeo = iServices.insertEntGeo( EntGeo(nom ="Venezuela", typeEntGeo= paysTypeEngeo))
        val vietNamEntGeo = iServices.insertEntGeo( EntGeo(nom ="Viet Nam", typeEntGeo= paysTypeEngeo))
        val yemenEntGeo = iServices.insertEntGeo( EntGeo(nom ="Yémen", typeEntGeo= paysTypeEngeo))
        val zambieEntGeo = iServices.insertEntGeo( EntGeo(nom ="Zambie", typeEntGeo= paysTypeEngeo))
        val zimbabweEntGeo = iServices.insertEntGeo( EntGeo(nom ="Zimbabwe", typeEntGeo= paysTypeEngeo))
        val kosovoEntGeo = iServices.insertEntGeo( EntGeo(nom ="Kosovo", typeEntGeo= paysTypeEngeo))

        //province
        val g1EntGeo = iServices.insertEntGeo( EntGeo(nom ="Estuaire", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g2EntGeo = iServices.insertEntGeo( EntGeo(nom ="Haut-ogooué", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g3EntGeo = iServices.insertEntGeo( EntGeo(nom ="Moyen-ogooué", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g4EntGeo = iServices.insertEntGeo( EntGeo(nom ="Ngounié", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g5EntGeo = iServices.insertEntGeo( EntGeo(nom ="Nyanga", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g6EntGeo = iServices.insertEntGeo( EntGeo(nom ="Ogooué-Ivindo", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g7EntGeo = iServices.insertEntGeo( EntGeo(nom ="Ogooué-Lolo", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g8EntGeo = iServices.insertEntGeo( EntGeo(nom ="Ogooué-Maritime", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))
        val g9EntGeo = iServices.insertEntGeo( EntGeo(nom ="Woleu-Ntem", parent = gabonEntGeo, typeEntGeo = provinceTypeEngeo))



        //departement G1
        val komoOceanEntGeo = iServices.insertEntGeo(EntGeo(nom="Komo-Océan", parent=g1EntGeo, typeEntGeo=departementTypeEngeo))
        val komoEntGeo = iServices.insertEntGeo(EntGeo(nom="Komo", parent=g1EntGeo, typeEntGeo=departementTypeEngeo))
        val komoMondahEntGeo = iServices.insertEntGeo(EntGeo(nom="Komo-Mondah", parent=g1EntGeo, typeEntGeo=departementTypeEngeo))
        val lbvEntGeo = iServices.insertEntGeo(EntGeo(nom="Libreville", parent=g1EntGeo, typeEntGeo=departementTypeEngeo))
        val noyaEntGeo = iServices.insertEntGeo(EntGeo(nom="Noya", parent=g1EntGeo, typeEntGeo=departementTypeEngeo))
        //departement G2
        val bayiEntGeo = iServices.insertEntGeo(EntGeo(nom="Bayi-brikolo", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val djouoriEntGeo = iServices.insertEntGeo(EntGeo(nom="Djouori-agnili", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val djoueEntGeo = iServices.insertEntGeo(EntGeo(nom="Djoué", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val lemboumbiEntGeo = iServices.insertEntGeo(EntGeo(nom="Lemboumbi-leyou", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val lekabiEntGeo = iServices.insertEntGeo(EntGeo(nom="Lékabi-léwolo", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val lekokoEntGeo = iServices.insertEntGeo(EntGeo(nom="Lékoko", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val lekoniEntGeo = iServices.insertEntGeo(EntGeo(nom="Lékoni-lékori", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val mpassaEntGeo = iServices.insertEntGeo(EntGeo(nom="Mpassa", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val ogoueEntGeo = iServices.insertEntGeo(EntGeo(nom="Ogooué-létili", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val plateauxEntGeo = iServices.insertEntGeo(EntGeo(nom="Plateaux", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        val sebeEntGeo = iServices.insertEntGeo(EntGeo(nom="Sébé-brikolo", parent=g2EntGeo, typeEntGeo=departementTypeEngeo))
        //departement G3
        val abangaEntGeo = iServices.insertEntGeo(EntGeo(nom="Abanga-bigné", parent=g3EntGeo, typeEntGeo=departementTypeEngeo))
        val ogouLacEntGeo = iServices.insertEntGeo(EntGeo(nom="Ogooué et des lacs", parent=g3EntGeo, typeEntGeo=departementTypeEngeo))

        //departement G4
        val boumiEntGeo = iServices.insertEntGeo(EntGeo(nom="boumi-louetsi", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val dolaEntGeo = iServices.insertEntGeo(EntGeo(nom="Dola", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val douyaEntGeo = iServices.insertEntGeo(EntGeo(nom="Douya-onoye", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val louetsiBibakaEntGeo = iServices.insertEntGeo(EntGeo(nom="Louetsi-bibaka", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val louetsiWanoEntGeo = iServices.insertEntGeo(EntGeo(nom="Louetsi-wano", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val mougalabaEntGeo = iServices.insertEntGeo(EntGeo(nom="Mougalaba", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val ndolouEntGeo = iServices.insertEntGeo(EntGeo(nom="Ndolou", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val ogoulouEntGeo = iServices.insertEntGeo(EntGeo(nom="Ogoulou", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))
        val tsambaEntGeo = iServices.insertEntGeo(EntGeo(nom="Tsamba-magotsi", parent=g4EntGeo, typeEntGeo=departementTypeEngeo))

        //departement G5
        val basseBanioEntGeo = iServices.insertEntGeo(EntGeo(nom="Basse-banio", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))
        val douignyEntGeo = iServices.insertEntGeo(EntGeo(nom="Douigny", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))
        val doutsilaEntGeo = iServices.insertEntGeo(EntGeo(nom="Doutsila", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))
        val hauteBanioEntGeo = iServices.insertEntGeo(EntGeo(nom="Haute-banio", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))
        val mongoEntGeo = iServices.insertEntGeo(EntGeo(nom="Mongo", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))
        val mougoutsiEntGeo = iServices.insertEntGeo(EntGeo(nom="Mougoutsi", parent=g5EntGeo, typeEntGeo=departementTypeEngeo))


        //departement G6
        val ivindoEntGeo = iServices.insertEntGeo(EntGeo(nom="Ivindo", parent=g6EntGeo, typeEntGeo=departementTypeEngeo))
        val lopeEntGeo = iServices.insertEntGeo(EntGeo(nom="Lopé", parent=g6EntGeo, typeEntGeo=departementTypeEngeo))
        val mvoungEntGeo = iServices.insertEntGeo(EntGeo(nom="Mvoung", parent=g6EntGeo, typeEntGeo=departementTypeEngeo))
        val zadieEntGeo = iServices.insertEntGeo(EntGeo(nom="Zadié", parent=g6EntGeo, typeEntGeo=departementTypeEngeo))


        //departement G7
        val loloBoueEntGeo = iServices.insertEntGeo(EntGeo(nom="Lolo-bouenguidi", parent=g7EntGeo, typeEntGeo=departementTypeEngeo))
        val lomboEntGeo = iServices.insertEntGeo(EntGeo(nom="Lombo-bouenguidi", parent=g7EntGeo, typeEntGeo=departementTypeEngeo))
        val mulunduEntGeo = iServices.insertEntGeo(EntGeo(nom="Mulundu", parent=g7EntGeo, typeEntGeo=departementTypeEngeo))
        val offoueEntGeo = iServices.insertEntGeo(EntGeo(nom="Offoué-onoye", parent=g7EntGeo, typeEntGeo=departementTypeEngeo))

        //departement G8
        val bendjeEntGeo = iServices.insertEntGeo(EntGeo(nom="Bendjé", parent=g8EntGeo, typeEntGeo=departementTypeEngeo))
        val etimboueEntGeo = iServices.insertEntGeo(EntGeo(nom="Etimboué", parent=g8EntGeo, typeEntGeo=departementTypeEngeo))
        val ndougouEntGeo = iServices.insertEntGeo(EntGeo(nom="Ndougou", parent=g8EntGeo, typeEntGeo=departementTypeEngeo))


        //departement G9
        val hautKomoEntGeo = iServices.insertEntGeo(EntGeo(nom="Haut-komo", parent=g9EntGeo, typeEntGeo=departementTypeEngeo))
        val hautNtemEntGeo = iServices.insertEntGeo(EntGeo(nom="Haut-ntem", parent=g9EntGeo, typeEntGeo=departementTypeEngeo))
        val ntemEntGeo = iServices.insertEntGeo(EntGeo(nom="Ntem", parent=g9EntGeo, typeEntGeo=departementTypeEngeo))
        val okanoEntGeo = iServices.insertEntGeo(EntGeo(nom="Okano", parent=g9EntGeo, typeEntGeo=departementTypeEngeo))
        val woleuEntGeo = iServices.insertEntGeo(EntGeo(nom="Woleu", parent=g9EntGeo, typeEntGeo=departementTypeEngeo))



        //ville G1
        iServices.insertEntGeo(EntGeo(nom="Ndzomoé",parent= komoOceanEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Kango", parent= komoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Ntoum", parent=komoMondahEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Owendo", parent=komoMondahEntGeo, typeEntGeo = villeTypeEngeo));
        entGeoLbv = iServices.insertEntGeo(EntGeo(nom="Libreville", parent=lbvEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Akanda", parent=lbvEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Cocobeach", parent=noyaEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G2
        iServices.insertEntGeo(EntGeo(nom="Aboumi", parent=bayiEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Bongoville", parent=djouoriEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Onga", parent=djoueEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Moanda", parent=lemboumbiEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Ngouoni", parent=lekabiEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Bakoumba", parent=lekokoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Akiéni", parent=lekoniEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Franceville", parent=mpassaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Boumango", parent=ogoueEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Lékoni", parent=plateauxEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Okondja", parent=sebeEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G3
        iServices.insertEntGeo(EntGeo(nom="Ndjolé", parent=abangaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Lambaréné", parent=ogouLacEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G4
        iServices.insertEntGeo(EntGeo(nom="Mbigou", parent=boumiEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Ndendé", parent=dolaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mouila", parent=douyaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Malinga", parent=louetsiBibakaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Lébamba", parent=louetsiWanoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Guiétsou ", parent=mougalabaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mandji", parent=ndolouEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mimongo", parent=ogoulouEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Fougamou", parent=tsambaEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G5
        iServices.insertEntGeo(EntGeo(nom="Mayumba", parent=basseBanioEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Moabi", parent=douignyEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mabanda", parent=doutsilaEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Ndindi", parent=hauteBanioEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Moulengui-binza", parent=mongoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Tchibanga", parent=mougoutsiEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G6
        iServices.insertEntGeo(EntGeo(nom="makokou", parent=ivindoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Booué", parent=lopeEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Ovan", parent=mvoungEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mékambo", parent=zadieEntGeo, typeEntGeo = villeTypeEngeo));
        //ville G7
        iServices.insertEntGeo(EntGeo(nom="Koulamoutou", parent=loloBoueEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Pana", parent=lomboEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Lastoursville", parent=mulunduEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Iboundji", parent=offoueEntGeo, typeEntGeo = villeTypeEngeo));

        //ville G8
        iServices.insertEntGeo(EntGeo(nom="Port-gentil", parent=bendjeEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Omboué", parent=etimboueEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Gamba", parent=ndougouEntGeo, typeEntGeo = villeTypeEngeo));

        //ville G9
        iServices.insertEntGeo(EntGeo(nom="Médouneu", parent=hautKomoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Minvoul", parent=hautNtemEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Bitam", parent=ntemEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Mitzic", parent=okanoEntGeo, typeEntGeo = villeTypeEngeo));
        iServices.insertEntGeo(EntGeo(nom="Oyem", parent=woleuEntGeo, typeEntGeo = villeTypeEngeo));

    }



}

fun main(args: Array<String>) {
    runApplication<EntgeoApplication>(*args)
}
