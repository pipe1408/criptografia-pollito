package com.ciberseguridad;

public class DatosPollito {

    public static final String[] PALABRAS_COMUNES = {
            "pollito",
            "papas",
            "pollitoconpapas",
            "kfc",
            "chicken",
            "pollo",
            "pollocampero",
            "apollo"
    };

    public static final String[] ALFABETO = {"a","b","c","d","e","f","g","h","i","j","k","l",
            "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public static final String[] CLAVES_EXPUESTAS = {
            "aece0490200448f4688c1bbd878d1e07e5a7c6f647a67d059abaf197dbf9f9d3",
            "f8ab5bf5d9187614017da5dfead24f7283782aa831f9680c238792cbe824adac",
            "cf005d65cae63741a161ea39a0dde501603b0d3aa3537823e771f6abb0c3020e",
            "6fc3f73ceb1e92694e5d34b787fdcabf28e6ccbd8c92ee23d52dacc81c4f426c",
            "242099b12ff7d6624d65504e034c1f5e6d0196f8b1f046a0528950d4714819d5",
            "abe12f2b9cbda7d73e4c7de7bf3962ec1ff99f32ab430b745aaa80fcc47ad306",
            "9434421d88b59b062eaeb44c2cac827687cb2ad2043fd58fda9683823e2edba5",
            "7ffdd62dc0daceeb776d8c0a13a3e5c1a02a5afa4ee89b940ad5100f3a3959f2",
            "4664df306e1bda3b53e9ee26e46ef2b4f9ed343df8b400d84c5887b06691af73",
            "a5b025c7f2719577d32a56c0d45843ebbc3cbfc73c297b2fb5802f9f8adc8368",
            "84283ab2fd72d4cb5096bd06bd8bf8c07ddd92711f24418ff58fa0a5387f4b01",
            "ed43fc8b304778e75c7058c9a0797fabbb1dbab6b02f1ef7d675b8d10da9c84a",
            "0c9bf4d2f9572bdf6cc99f09db00c355715fbb678065d0ccd47d802170d691db",
            "e109effe2a19f064daa7e7b72f0aebf3f5d8d5ac245c817bce96f2c5de5dae28",
            "9ca807042f651ebf99f0ce1188748d5da25f71d3bbc10f99214035b4fcbf04ae",
            "1256940be2390fb92c6cb55f3f4e4575c56fcd436998e2022c7a928dbe37c989",
            "1f4a58a2bb3315f2574545c361efe069a80249f475f3c93da6ed0cc12b6c4847",
            "74e81fb84bb5ccda37f14915107ac36aef9289d35488286133b6543831322493",
            "00d6dff2944ba9767a7190fa2ad07eb9a066a34a1edf4fa10bd7e909495b986c",
            "467a2a646ced89536cfd78329f40554876e92ca668a2ea370faa5cb21e54e932",
            "39573bc2ed12a1ef2607ae350b2be599675fdde9a37c1f07983a3f648dae76af"
    };

    public static final String[] ROCKYOU_3000 = {
            "123456", "12345", "123456789", "password", "iloveyou", "princess", "1234567", "rockyou",
            "12345678", "abc123", "nicole", "daniel", "babygirl", "monkey", "lovely", "jessica",
            "654321", "michael", "ashley", "qwerty", "111111", "iloveu", "000000", "michelle",
            "tigger", "sunshine", "chocolate", "password1", "soccer", "anthony", "friends", "butterfly",
            "purple", "angel", "jordan", "liverpool", "justin", "loveme", "fuckyou", "123123", "football",
            "secret", "andrea", "carlos", "jennifer", "joshua", "bubbles", "1234567890", "superman",
            "hannah", "amanda", "loveyou", "pretty", "basketball", "andrew", "angels", "tweety", "flower",
            "playboy", "hello", "elizabeth", "hottie", "tinkerbell", "charlie", "samantha", "barbie",
            "chelsea", "lovers", "teamo", "jasmine", "brandon", "666666", "shadow", "melissa", "eminem",
            "matthew", "robert", "danielle", "forever", "family", "jonathan", "987654321", "computer",
            "whatever", "dragon", "vanessa", "cookie", "naruto", "summer", "sweety", "spongebob", "joseph",
            "junior", "softball", "taylor", "yellow", "daniela", "lauren", "mickey", "princesa", "alexandra",
            "alexis", "jesus", "estrella", "miguel", "william", "thomas", "beautiful", "mylove", "angela",
            "poohbear", "patrick", "iloveme", "sakura", "adrian", "alexander", "destiny", "christian",
            "121212", "sayang", "america", "dancer", "monica", "richard", "112233", "princess1", "555555",
            "diamond", "carolina", "steven", "rangers", "louise", "orange", "789456", "999999", "shorty",
            "11111", "nathan", "snoopy", "gabriel", "hunter", "cherry", "killer", "sandra", "alejandro",
            "buster", "george", "brittany", "alejandra", "patricia", "rachel", "tequiero", "7777777", "cheese",
            "159753", "arsenal", "dolphin", "antonio", "heather", "david", "ginger", "stephanie", "peanut",
            "blink182", "sweetie", "222222", "beauty", "987654", "victoria", "honey", "00000", "fernando",
            "pokemon", "maggie", "corazon", "chicken", "pepper", "cristina", "rainbow", "kisses", "manuel",
            "myspace", "rebelde", "angel1", "ricardo", "babygurl", "heaven", "55555", "baseball", "martin",
            "greenday", "november", "alyssa", "madison", "mother", "123321", "123abc", "mahalkita", "batman",
            "september", "december", "morgan", "mariposa", "maria", "gabriela", "iloveyou2", "bailey",
            "jeremy", "pamela", "kimberly", "gemini", "shannon", "pictures", "asshole", "sophie", "jessie",
            "hellokitty", "claudia", "babygirl1", "angelica", "austin", "mahalko", "victor", "horses",
            "tiffany", "mariana", "eduardo", "andres", "courtney", "booboo", "kissme", "harley", "ronaldo",
            "iloveyou1", "precious", "october", "inuyasha", "peaches", "veronica", "chris", "888888",
            "adriana", "cutie", "james", "banana", "prince", "friend", "jesus1", "crystal", "celtic",
            "zxcvbnm", "edward", "oliver", "diana", "samsung", "freedom", "angelo", "kenneth", "master",
            "scooby", "carmen", "456789", "sebastian", "rebecca", "jackie", "spiderman", "christopher",
            "karina", "johnny", "hotmail", "0123456789", "school", "barcelona", "august", "orlando", "samuel",
            "cameron", "slipknot", "cutiepie", "monkey1", "50cent", "bonita", "kevin", "bitch", "maganda",
            "babyboy", "casper", "brenda", "adidas", "kitten", "karen", "mustang", "isabel", "natalie",
            "cuteako", "javier", "789456123", "123654", "sarah", "bowwow", "portugal", "laura", "777777",
            "marvin", "denise", "tigers", "volleyball", "jasper", "rockstar", "january", "fuckoff", "alicia",
            "nicholas", "flowers", "cristian", "tintin", "bianca", "chrisbrown", "chester", "101010",
            "smokey", "silver", "internet", "sweet", "strawberry", "garfield", "dennis", "panget", "francis",
            "cassie", "benfica", "love123", "696969", "asdfgh", "lollipop", "olivia", "cancer", "camila",
            "qwertyuiop", "superstar", "harrypotter", "ihateyou", "charles", "monique", "midnight",
            "vincent", "christine", "apples", "scorpio", "jordan23", "lorena", "andreea", "mercedes",
            "katherine", "charmed", "abigail", "rafael", "icecream", "mexico", "brianna", "nirvana",
            "aaliyah", "pookie", "johncena", "lovelove", "fucker", "abcdef", "benjamin", "131313", "gangsta",
            "brooke", "333333", "hiphop", "aaaaaa", "mybaby", "sergio", "welcome", "metallica", "julian",
            "travis", "myspace1", "babyblue", "sabrina", "michael1", "jeffrey", "stephen", "love", "dakota",
            "catherine", "badboy", "fernanda", "westlife", "blondie", "sasuke", "smiley", "jackson", "simple",
            "melanie", "steaua", "dolphins", "roberto", "fluffy", "teresa", "piglet", "ronald", "slideshow",
            "asdfghjkl", "minnie", "newyork", "jason", "raymond", "santiago", "jayson", "88888888", "5201314",
            "jerome", "gandako", "muffin", "gatita", "babyko", "246810", "sweetheart", "chivas", "ladybug",
            "kitty", "popcorn", "alberto", "valeria", "cookies", "leslie", "jenny", "nicole1", "12345678910",
            "leonardo", "jayjay", "liliana", "dexter", "sexygirl", "232323", "amores", "rockon", "christ",
            "babydoll", "anthony1", "marcus", "bitch1", "fatima", "miamor", "lover", "chris1", "single",
            "eeyore", "lalala", "252525", "scooter", "natasha", "skittles", "brooklyn", "colombia", "159357",
            "teddybear", "winnie", "happy", "manutd", "123456a", "britney", "katrina", "christina", "pasaway",
            "cocacola", "mahal", "grace", "linda", "albert", "tatiana", "london", "cantik", "0123456",
            "lakers", "marie", "teiubesc", "147258369", "charlotte", "natalia", "francisco", "amorcito",
            "smile", "paola", "angelito", "manchester", "hahaha", "elephant", "mommy1", "shelby", "147258",
            "kelsey", "genesis", "amigos", "snickers", "xavier", "turtle", "marlon", "linkinpark", "claire",
            "stupid", "147852", "marina", "garcia", "fuckyou1", "diego", "brandy", "letmein", "hockey",
            "444444", "sharon", "bonnie", "spider", "iverson", "andrei", "justine", "frankie", "pimpin",
            "disney", "rabbit", "54321", "fashion", "soccer1", "red123", "bestfriend", "england", "hermosa",
            "456123", "qazwsx", "bandit", "danny", "allison", "emily", "102030", "lucky1", "sporting",
            "miranda", "dallas", "hearts", "camille", "wilson", "potter", "pumpkin", "iloveu2", "number1",
            "katie", "guitar", "212121", "truelove", "jayden", "savannah", "hottie1", "phoenix", "monster",
            "player", "ganda", "people", "scotland", "nelson", "jasmin", "timothy", "onelove", "ilovehim",
            "shakira", "estrellita", "bubble", "smiles", "brandon1", "sparky", "barney", "sweets", "parola",
            "evelyn", "familia", "love12", "nikki", "motorola", "florida", "omarion", "monkeys", "loverboy",
            "elijah", "joanna", "canada", "ronnie", "mamita", "emmanuel", "thunder", "999999999", "broken",
            "rodrigo", "maryjane", "westside", "california", "lucky", "mauricio", "yankees", "jackass",
            "jamaica", "justin1", "amigas", "preciosa", "shopping", "flores", "mariah", "matrix", "isabella",
            "tennis", "trinity", "jorge", "sunflower", "kathleen", "bradley", "cupcake", "hector", "martinez",
            "elaine", "robbie", "friendster", "cheche", "gracie", "connor", "hello1", "valentina", "melody",
            "darling", "sammy", "jamie", "santos", "abcdefg", "joanne", "candy", "fuckyou2", "loser",
            "dominic", "pebbles", "sunshine1", "swimming", "millie", "loving", "gangster", "blessed",
            "compaq", "taurus", "gloria", "tyler", "aaron", "darkangel", "kitkat", "megan", "dreams",
            "sweetpea", "bettyboop", "jessica1", "cynthia", "cheyenne", "ferrari", "dustin", "iubire",
            "a123456", "snowball", "purple1", "violet", "darren", "starwars", "bestfriends", "inlove",
            "kelly", "batista", "karla", "sophia", "chacha", "biteme", "marian", "sydney", "sexyme",
            "pogiako", "gerald", "jordan1", "010203", "daddy1", "zachary", "daddysgirl", "billabong",
            "carebear", "froggy", "pinky", "erika", "oscar", "skater", "raiders", "nenita", "tigger1",
            "ashley1", "charlie1", "gatito", "lokita", "maldita", "buttercup", "nichole", "bambam", "nothing",
            "glitter", "bella", "amber", "apple", "123789", "sister", "zacefron", "tokiohotel", "loveya",
            "lindsey", "money", "lovebug", "bubblegum", "marissa", "dreamer", "darkness", "cecilia",
            "lollypop", "nicolas", "google", "lindsay", "cooper", "passion", "kristine", "green", "puppies",
            "ariana", "fuckme", "chubby", "raquel", "lonely", "anderson", "sammie", "sexybitch", "mario",
            "butter", "willow", "roxana", "mememe", "caroline", "susana", "kristen", "baller", "hotstuff",
            "carter", "stacey", "babylove", "angelina", "miller", "scorpion", "sierra", "playgirl",
            "sweet16", "012345", "rocker", "bhebhe", "gustavo", "marcos", "chance", "123qwe", "kayla",
            "james1", "football1", "eagles", "loveme1", "milagros", "stella", "lilmama", "beyonce",
            "lovely1", "rocky", "daddy", "catdog", "armando", "margarita", "151515", "loves", "lolita",
            "202020", "gerard", "undertaker", "amistad", "williams", "qwerty1", "freddy", "capricorn",
            "caitlin", "bryan", "delfin", "dance", "cheerleader", "password2", "PASSWORD", "martha",
            "lizzie", "georgia", "matthew1", "enrique", "zxcvbn", "badgirl", "andrew1", "141414",
            "11111111", "dancing", "cuteme", "booger", "amelia", "vampire", "skyline", "chiquita",
            "angeles", "scoobydoo", "janine", "tamara", "carlitos", "money1", "sheila", "justme", "ireland",
            "kittycat", "hotdog", "yamaha", "tristan", "harvey", "israel", "legolas", "michelle1",
            "maddie", "angie", "cinderella", "jesuschrist", "lester", "ashton", "ilovejesus", "tazmania",
            "remember", "xxxxxx", "tekiero", "thebest", "princesita", "lucky7", "jesucristo", "peewee",
            "paloma", "buddy1", "deedee", "miriam", "april", "patches", "regina", "janice", "cowboys",
            "myself", "lipgloss", "jazmin", "rosita", "happy1", "felipe", "chichi", "pangit", "mierda",
            "genius", "741852963", "hernandez", "awesome", "walter", "tinker", "arturo", "silvia",
            "melvin", "celeste", "pussycat", "gorgeous", "david1", "molly", "honeyko", "mylife", "animal",
            "penguin", "babyboo", "loveu", "simpsons", "lupita", "boomer", "panthers", "hollywood",
            "alfredo", "musica", "johnson", "ilovegod", "hawaii", "sparkle", "kristina", "sexymama",
            "crazy", "valerie", "spencer", "scarface", "hardcore", "098765", "00000000", "winter", "hailey",
            "trixie", "hayden", "micheal", "wesley", "242424", "0987654321", "marisol", "nikita", "daisy",
            "jeremiah", "pineapple", "mhine", "isaiah", "christmas", "cesar", "lolipop", "butterfly1",
            "chloe", "lawrence", "xbox360", "sheena", "murphy", "madalina", "anamaria", "gateway",
            "debbie", "yourmom", "blonde", "jasmine1", "please", "bubbles1", "jimmy", "beatriz", "poopoo",
            "diamonds", "whitney", "friendship", "sweetness", "pauline", "desiree", "trouble", "741852",
            "united", "marley", "brian", "barbara", "hannah1", "bananas", "julius", "leanne", "sandy",
            "marie1", "anita", "lover1", "chicago", "twinkle", "pantera", "february", "birthday", "shadow1",
            "qwert", "bebita", "87654321", "twilight", "imissyou", "pollito", "ashlee", "tucker", "cookie1",
            "shelly", "catalina", "147852369", "beckham", "simone", "nursing", "iloveyou!", "eugene",
            "torres", "damian", "123123123", "joshua1", "bobby", "babyface", "andre", "donald", "daniel1",
            "panther", "dinamo", "mommy", "juliana", "cassandra", "trustno1", "sexylady", "14344",
            "autumn", "mendoza", "animals", "perfect", "mariel", "bullshit", "bitches", "852456", "marcela",
            "drpepper", "gerardo", "titanic", "robert1", "alison", "moomoo", "paulina", "blossom",
            "simpleplan", "cutie1", "abcd1234", "bethany", "kucing", "bulldogs", "buddy", "fabian",
            "ILOVEYOU", "hollister", "samson", "harold", "serenity", "lovehurts", "tyrone", "rodriguez",
            "amanda1", "willie", "kaylee", "pisces", "patito", "paradise", "1111111", "piolin", "reggie",
            "diesel", "salvador", "dianne", "cowboy", "143143", "chanel", "joseluis", "sanchez", "peterpan",
            "diosesamor", "stars", "dancer1", "element", "derrick", "coffee", "grandma", "always", "ashleigh",
            "181818", "marshall", "jason1", "helena", "tanner", "theresa", "sweet1", "chinita", "alexandru",
            "mihaela", "trisha", "mitchell", "love4ever", "1234", "shane", "bulldog", "brownie", "thuglife",
            "amormio", "margaret", "calvin", "aquarius", "phillip", "kitty1", "morena", "heart", "rosario",
            "thumper", "marius", "sammy1", "aaaaa", "yvonne", "panda", "lorraine", "babycakes", "kaitlyn",
            "hayley", "bigboy", "esther", "gerrard", "frances", "sexy123", "catarina", "archie", "tweety1",
            "danger", "rockme", "pickles", "marco", "arnold", "gregory", "taylor1", "brittney", "superman1",
            "babies", "lorenzo", "hamster", "sofia", "rock you", "dominique", "jenjen", "donkey", "11223344",
            "yasmin", "trevor", "roxanne", "audrey", "happiness", "creative", "virginia", "castillo",
            "godisgood", "chrissy", "police", "joyjoy", "giggles", "shorty1", "speedy", "parker", "sports",
            "italia", "cuddles", "nadine", "tyler1", "1q2w3e4r", "pelusa", "beautiful1", "boston", "summer1",
            "753951", "black", "fabiola", "kittykat", "jocelyn", "darwin", "junjun", "cristo", "cheer",
            "mickey1", "ghetto", "asdfg", "rosebud", "julio", "cuteko", "madison1", "russell", "bloods",
            "maxwell", "maverick", "babygurl1", "wildcats", "rochelle", "fantasy", "faith", "sarita",
            "rooney", "gabrielle", "alisha", "kayleigh", "macmac", "mississippi", "gilbert", "college",
            "justice", "mickeymouse", "curtis", "12341234", "toyota", "william1", "soledad", "rascal",
            "golden", "1q2w3e", "naughty", "gwapako", "prettygirl", "friends1", "camilo", "busted",
            "singer", "pretty1", "jellybean", "yolanda", "pinkie", "love13", "123654789", "johanna",
            "hershey", "elizabeth1", "philip", "holas", "marilyn", "buttons", "ramona", "carla", "australia",
            "bismillah", "7654321", "bigdaddy", "9876543210", "photos", "franklin", "pink123", "erick",
            "vanilla", "briana", "hello123", "jacob", "hilary", "pedro", "loveme2", "callum", "watermelon",
            "lourdes", "janelle", "PRINCESS", "juancarlos", "tania", "unicorn", "rahasia", "ihateu",
            "lovergirl", "latina", "cheer1", "shirley", "dragons", "breanna", "sapphire", "papito",
            "diablo", "montana", "asshole1", "22222", "lucky13", "dylan", "cricket", "warren", "scotty",
            "teamomucho", "passw0rd", "lavender", "iluvme", "yellow1", "emerald", "douglas", "therock",
            "aurora", "hunter1", "emanuel", "yoyoyo", "krystal", "flower1", "belinda", "tiger", "hotgirl",
            "010101", "poohbear1", "cuties", "valentine", "idontknow", "pikachu", "little", "diamond1",
            "iloveu1", "babyphat", "peanut1", "kittens", "goddess", "ballet", "damien", "nascar", "171717",
            "rangers1", "winston", "0000000000", "rocky1", "coolgirl", "maymay", "charlene", "caramelo",
            "selena", "lucero", "wendy", "volcom", "1435254", "copper", "cindy", "baby123", "slayer",
            "angelita", "love1", "alexa", "kingkong", "pickle", "guadalupe", "lovelife", "142536",
            "esmeralda", "houston", "dayana", "kissmyass", "handsome", "paula", "wicked", "shithead",
            "iloveme1", "sexybabe", "nathaniel", "incubus", "crazy1", "candy1", "loulou", "buster1",
            "ramirez", "falloutboy", "richie", "converse", "2cute4u", "shaggy", "rayray", "phoebe",
            "teacher", "spongebob1", "boogie", "marisa", "madonna", "eunice", "dianita", "special",
            "norman", "connie", "myname", "hotchick", "1111111111", "chelsea1", "124578", "080808",
            "music", "sagitario", "sassy1", "family1", "yahoo", "sexy12", "danica", "angel123", "lacoste",
            "cutegirl", "campanita", "billy", "kristin", "linkin", "161616", "realmadrid", "jesse",
            "iceman", "a12345", "spanky", "liberty", "molly1", "ronaldinho", "password123", "windows",
            "peter", "kelvin", "gothic", "walker", "maribel", "goldfish", "atlanta", "moises", "chicken1",
            "0000000", "tommy", "juventus", "mahalkoh", "esteban", "mookie", "fresita", "leelee",
            "tequieromucho", "harry", "giovanni", "ranger", "celticfc", "tagged", "snuggles", "preston",
            "newcastle", "austin1", "sniper", "erica", "stefan", "ecuador", "hotpink", "soulmate", "shutup",
            "1qaz2wsx", "taytay", "sassy", "iverson3", "playboy1", "lunita", "honey1", "951753", "thomas1",
            "bernard", "peace", "arthur", "12345a", "marlboro", "merlin", "southside", "loser1", "brandi",
            "arlene", "blueeyes", "michel", "rachelle", "mackenzie", "ernesto", "champion", "missy",
            "mamapapa", "fatboy", "darius", "282828", "edgar", "alexia", "landon", "nicola", "99999",
            "nancy", "hermione", "cosita", "nissan", "michele", "starlight", "unique", "tiger1", "rivera",
            "morales", "coolcat", "steelers", "judith", "dimples", "chocolate1", "viviana", "rodney",
            "iluvu", "maurice", "katelyn", "carrie", "111222", "gonzalez", "softball1", "random",
            "kennedy", "esperanza", "pierre", "moonlight", "baby12", "spirit", "love22", "nintendo",
            "marlene", "234567", "shasha", "snowflake", "children", "stanley", "newlife", "goober",
            "doraemon", "ingrid", "father", "77777", "geraldine", "dimple", "dillon", "romance", "bunny",
            "bhaby", "winner", "tweetybird", "kathryn", "paramore", "allstar", "abcde", "something",
            "runescape", "jermaine", "jefferson", "pitbull", "seventeen", "romania", "france", "emotional",
            "nigger", "mariela", "fucku", "bitchy", "ballin", "loveless", "smallville", "ricky", "peluche",
            "godbless", "blue123", "alonso", "meghan", "garrett", "mykids", "mexico1", "clover", "vanesa",
            "smudge", "cooldude", "chopper", "cassidy", "andreita", "134679", "cherries", "070707",
            "skippy", "kaykay", "domino", "ximena", "julie", "goldie", "daisy1", "bella1", "thailand",
            "puppy", "gladys", "computer1", "boricua", "karate", "janjan", "freddie", "acuario", "262626",
            "yugioh", "marjorie", "maggie1", "blueberry", "joyce", "basket", "sunset", "hummer", "destiny1",
            "annie", "angelbaby", "amber1", "pakistan", "negrita", "kendra", "blue22", "dipset", "coconut",
            "kirsty", "danilo", "alexis1", "whatever1", "cameron1", "booboo1", "aileen", "191919",
            "samantha1", "sponge", "abraham", "ilovemyself", "guillermo", "groovy", "cheeky", "swordfish",
            "kevin1", "dragon1", "blahblah", "babyboy1", "granny", "bintang", "harmony", "wrestling",
            "poopie", "green1", "cheryl", "alfonso", "nathan1", "dragonfly", "yourock", "ragnarok",
            "jazmine", "bonbon", "michaela", "carlo", "theone", "serena", "rock you", "manunited",
            "iloveboys", "blacky", "karlita", "bogdan", "mikey", "love69", "jillian", "eclipse", "catalin",
            "punkrock", "mollie", "bugsbunny", "patrick1", "supergirl", "melisa", "lilwayne", "miracle",
            "alianza", "warrior", "christy", "harley1", "jennifer1", "hollie", "violeta", "puppylove",
            "munchkin", "fender", "moreno", "maureen", "makayla", "emilio", "brother", "ilovechris",
            "gymnastics", "helpme", "doggie", "mmmmmm", "bailey1", "milkshake", "rachael", "goodgirl",
            "athena", "kenzie", "john316", "blabla", "mathew", "virgin", "159951", "juanita", "ingeras",
            "pepper1", "mckenzie", "katkat", "caramel", "heyhey", "estrela", "steven1", "kenny", "love14",
            "holly", "estefania", "bullet", "manuela", "baseball1", "lenlen", "elena", "alfred", "geminis",
            "1password", "redrose", "keisha", "danny1", "casey", "chandler", "aubrey", "godislove",
            "lasvegas", "jajaja", "florin", "eternity", "danielle1", "seven7", "harrison", "felicia",
            "success", "starfish", "scrappy", "santana", "jupiter", "duncan", "butthead", "wallace",
            "holiday", "ariel", "america1", "mayra", "asdfjkl;", "ginger1", "chelle", "luisa", "rihanna",
            "myangel", "lampard", "wizard", "fiorella", "argentina", "2hot4u", "yesenia", "denisa",
            "stinky", "joseph1", "badass", "online", "joana", "blackie", "aaron1", "sailormoon", "killer1",
            "deanna", "junior1", "golfinho", "freaky", "futbol", "dragoste", "colleen", "popeye", "gonzales",
            "billie", "jaguar", "hehehe", "love11", "kathy", "dramaqueen", "josephine", "sarah1", "mermaid",
            "carito", "welcome1", "redsox", "carina", "arianna", "sexylove", "monika", "computadora",
            "ludacris", "kirsten", "clayton", "ilovematt", "asdasd", "sugar", "holden", "baxter", "yankee",
            "melissa1", "jonjon", "honduras", "carol", "ABC123", "yvette", "liverpoolfc", "ilovejosh",
            "fucku2", "dwayne", "berenice", "teddy", "momdad", "lovesucks", "joejonas", "forever1",
            "divina", "clifford", "tracey", "sasha", "rebeca", "frank", "1212312121", "nacional", "mibebe",
            "scott", "ronaldo7", "password12", "kisskiss", "fergie", "conejo", "272727", "hotmama",
            "evanescence", "stevie", "fishing", "callie", "bruno", "vivian", "thegame", "steph", "richard1",
            "coolio", "aventura", "rockyou1", "cristi", "simona", "love101", "eastside", "cristiano",
            "manson", "loveu2", "brayan", "88888", "valentin", "sublime", "redneck", "fernandez",
            "corona", "cleopatra", "mahalq", "luisito", "dalton", "gordon", "monday", "change",
            "blanca", "963852", "maxine", "knight", "fabulous", "roland", "qwe123", "pablo", "marcelo",
            "henry", "alvin", "love21", "cuttie", "annette", "Password", "maryann", "friday", "yanyan",
            "logitech", "stewart", "prettyme", "motherfucker", "jersey", "roberta", "raiders1", "martina",
            "gabby", "morris", "cherry1", "carlos1", "alaska", "sexy69", "orange1", "dolphin1", "wolves",
            "warriors", "microsoft", "medina", "agosto", "555666", "smelly", "jennie", "noodles",
            "missy1", "marines", "candice", "single1", "lizard", "brendan", "romeo", "cheetah", "090909",
            "tequila", "8675309", "leonard", "iluvyou", "heather1", "filipa", "castro", "tricia", "saints",
            "grandad", "love23", "pirates", "kimkim", "kieran", "kawasaki", "vegeta", "messenger",
            "juliet", "jetaime", "howard", "denver", "cintaku", "randy", "maximus", "jesus7", "jacqueline",
            "hercules", "amore", "everton", "legend", "kendall", "nightmare", "charmaine", "jonas",
            "drowssap", "alvaro", "456456", "suzanne", "mystuff", "mother1", "honeybee", "drummer",
            "bubba1", "antonia", "shiela", "shalom", "ruben", "platinum", "leticia", "german", "snowman",
            "romero", "madeline", "dulce", "turkey", "sweetgirl", "sayangku", "pancho", "mandy", "lollol",
            "edison", "ashanti", "angel12", "rocknroll", "andreia", "Princess", "freckles", "yousuck",
            "juanito", "ismael", "chingy", "taekwondo", "freedom1", "ericka", "020202", "franco",
            "celine", "trinidad", "smokey1", "promise", "jeremy1", "angel2", "alexandre", "ganteng",
            "arcangel", "julia", "precious1", "asd123", "jacob1", "cowgirl", "peaches1", "melinda",
            "sixteen", "qazwsxedc", "mustang1", "budlight", "newyork1", "loveyou2", "iluvu2", "cracker",
            "renato", "kenshin", "phantom", "loveable", "laptop", "hamilton", "fuckit", "blessed1",
            "virgo", "1bitch", "shauna", "private", "isabelle", "biatch", "surfer", "passport", "lynlyn",
            "kayla1", "bobmarley", "babykoh", "picture", "logan", "jesusfreak", "harris", "doodle",
            "sexybaby", "pink", "lizbeth", "bubba", "triskelion", "tootsie", "thalia", "rolando",
            "ilovemike", "apple1", "valencia", "shawn", "rommel", "maemae", "felicidad", "cheese1",
            "student", "rainbow1", "confused", "cellphone", "aldrin", "paris", "minime", "marion",
            "ewanko", "stormy", "sisters", "rocket", "queen", "lovers1", "slimshady", "steve", "poison",
            "florence", "rey619", "delete", "cristal", "yomama", "spooky", "pimpin1", "maricel",
            "gizmo1", "dondon", "divine", "chucky", "aries", "rowena", "nokia", "stitch", "jerry",
            "hazel", "maimai", "jackson1", "nataly", "emily1", "swimmer", "pussy", "loveyou1",
            "liverpool1", "lauren1", "chloe1", "jonathan1", "soloyo", "jonasbrothers", "eminem1",
            "anything", "nickjonas", "vodafone", "punkin", "mnbvcxz", "forget", "babes", "tasha",
            "magandaako", "madrid", "scruffy", "paige", "motocross", "colorado", "321654", "skyler",
            "sidney", "bryant", "malibu", "galaxy", "cruzazul", "paolita", "getmoney", "filipe",
            "applepie", "454545", "insane", "princes", "morado", "laurita", "country", "theused",
            "beatrice", "gunner", "greenday1", "edwin", "cinta", "ROCKYOU", "shanice", "kagome",
            "sherry", "penelope", "password3", "morgan1", "kakashi", "falcon", "alabama", "irock",
            "dorothy", "beverly", "avril", "hanson", "redhead", "germany", "regine", "marijuana",
            "121314", "rakista", "jenna", "escorpion", "weed420", "oscar1", "love15", "hihihi",
            "amazing", "nevaeh", "marimar", "jamie1", "DANIEL", "mypassword", "philips", "johana",
            "ilove", "hitman", "trandafir", "shannon1", "myfamily", "monalisa", "bonjovi", "xander",
            "scooby1", "robinson", "church", "wonderful", "potpot", "lucas", "password!", "zoey101",
            "qwerty123", "georgina", "bigred", "tonton", "telefon", "stuart", "pavilion", "chivas1",
            "jenifer", "jaime", "dance1", "aishiteru", "stardust", "grapes", "fatcat", "angel13",
            "milton", "bowwow1", "fofinha", "eddie", "tinker1", "doctor", "abercrombie", "pink12",
            "georgiana", "conner", "astig", "system", "candyfloss", "alondra", "winniethepooh",
            "love143", "g-unit", "iloveme2", "gizmo", "donnie", "brittany1", "bamboo", "katie1",
            "devils", "cathy", "bobby1", "benson", "a1b2c3", "tattoo", "skipper", "eleven", "cinnamon",
            "bernie", "psycho", "mypics", "mobile", "langga", "iloveryan", "falcons", "cowboys1",
            "alyssa1", "emilia", "050505", "spoiled", "antony", "allen", "respect", "princess2",
            "angeleyes", "american", "nemesis", "nathalie", "famous", "cedric", "wolverine", "snoopy1",
            "nelly", "madden", "13579", "shawty", "payton", "lifesucks", "broncos", "amalia", "alina",
            "monkey2", "mikaela", "emogirl", "963852741", "poncho", "gibson", "denisse", "303030",
            "292929", "sheryl", "super", "sonia", "pinky1", "chantelle", "puertorico", "meandyou",
            "marcel", "krissy", "kittie", "sprite", "manman", "kimmie", "hotboy", "emerson", "elamor",
            "capricornio", "black1", "misty", "lillian", "fuckoff1", "chelsey", "suzuki", "octubre",
            "magdalena", "bratz", "tomtom", "noodle", "carebears", "flamingo", "deborah", "tiffany1",
            "renee", "noviembre", "420420", "kenken", "gabriella", "dietcoke", "behappy", "1123581321",
            "marianne", "brianna1", "abcdefgh", "skyblue", "irene", "bombon", "anjing", "raven",
            "donna", "wedding", "sexy13", "chikita", "asawako", "wordpass", "naynay", "mariajose",
            "lionking", "devil", "xiomara", "soccer12", "music1", "moocow", "maritza", "samsam",
            "ivonne", "rodolfo", "lovable", "ilovepink", "hannahmontana", "girlfriend", "soccer10",
            "skateboard", "personal", "newport", "RockYou", "perrito", "nikki1", "mitch", "marine",
            "jesse1", "ilovemom", "pillow", "duckie", "brasil", "window", "rockers", "jamjam",
            "conejita", "mylove1", "lopez", "josue", "BABYGIRL", "sexyboy", "makaveli", "ilovejoe",
            "marcia", "007007", "southpark", "sherwin", "lestat", "desire", "445566", "pencil",
            "denden", "scooter1", "brazil", "boobies", "yankees1", "scarlet", "powers", "killua",
            "leandro", "burbuja", "bonjour", "armani", "poop", "nadia", "michigan", "astrid",
            "billybob", "theman", "sunday", "loquita", "kristy", "believe", "missyou", "english",
            "timmy", "simpson", "lennon", "frogger", "dingdong", "ssssss", "philly", "pepito",
            "naruto1", "lilman", "chelseafc", "blingbling", "batman1", "135790", "sparkles", "honeys",
            "graham", "flaquita", "dalejr", "smackdown", "iforgot", "barbie1", "wisdom", "queenie",
            "priscilla", "jenny1", "dakota1", "crystal1", "camaro", "lilbit", "jimenez", "babygirl2",
            "danielita", "bobbie", "789789", "sexygurl", "jjjjjj", "george1", "brayden", "boyfriend",
            "arizona", "savage", "noelle", "longhorns", "leonel", "celtic1888", "anastasia", "subaru",
            "lol123", "kellie", "coldplay", "terrell", "playstation", "kkkkkk", "delacruz", "charity",
            "borboleta", "johnpaul", "jimena", "gwapa", "estrellas", "donovan", "muhammad",
            "libertad", "jewels", "corina", "carmelo", "little1", "johnnydepp", "gordita",
            "diciembre", "racing", "dylan1", "krista", "eileen", "778899", "soccer13", "peachy",
            "princess12", "lamejor", "898989", "565656", "surfing", "ladybug1", "johnny1", "jeanette",
            "campbell", "amizade", "sucker", "sexsex", "senior", "pinklady", "losers", "dickhead",
            "classof08", "bluesky", "030303", "zzzzzz", "zidane", "sophie1", "player1", "gangsta1",
            "aol123", "soccer7", "rammstein", "louie", "cotton", "althea", "shamrock", "pandora",
            "netball", "mittens", "knights", "kimberley", "bigdog", "sexy101", "romina", "beatles",
            "baby", "1478963", "060606", "sexyback", "paulo", "jeffhardy", "secret1", "panasonic",
            "enigma", "cristy", "thankyou", "teodio", "porter", "maria1", "biscuit", "becky",
            "bautista", "allan", "spring", "malcolm", "francesca", "canela", "victory", "toshiba",
            "poppy", "mariam", "love16", "latoya", "killme", "bernardo", "renata", "password7",
            "laguna", "nofear", "megan1", "jimmy1", "jared", "12344321", "twister", "rosemary",
            "rooster", "retard", "daniella", "cosmin", "alexandria", "sweetie1", "soccer11", "pookie1",
            "joejoe", "guatemala", "corey", "celular", "scarlett", "hassan", "gators", "cloud9",
            "vicky", "rosie", "jakarta", "gillian", "flakita", "darlene", "tabitha", "russel",
            "nibbles", "mohamed", "margarida", "lemons", "johnjohn", "smile1", "manzana", "apollo",
            "angeline", "lilly", "dawson", "manolo", "jeffery", "brooklyn1", "bloodz", "tarzan",
            "halloween", "dandan", "sugar1", "lacrosse", "kiara", "keith", "star123", "senior06",
            "mamacita", "jazzy", "classof09", "belle", "patty", "mallory", "lottie", "lizeth",
            "hollister1", "carson", "bluemoon", "shibby", "libra", "jimbob", "declan", "5555555",
            "traviesa", "toffee", "skylar", "charly", "avatar", "alice", "987456", "titans",
            "suckit", "shelley", "rhiannon", "hallo", "daredevil", "christian1", "alvarez",
            "spunky", "ilovejohn", "brian1", "kickass", "ilovenick", "blood", "trigger",
            "pinkpink", "maddog", "9999999", "44444", "stupid1", "patrice", "lilfizz", "indian",
            "cartoon", "saturn", "magic", "hammer", "emopunk", "eliana", "daphne", "carmela",
            "666999", "yandel", "pippin", "peyton", "heartbreaker", "rockstar1", "loredana",
            "ilovehim1", "girlie", "acmilan", "shayne", "redred", "mamasita", "love08", "lilian",
            "jehova", "dragonball", "avrillavigne", "pokemon1", "logan1", "jester", "ilovesam",
            "valentino", "married", "joaquin", "azerty", "africa", "tootie", "nigga", "kingdom",
            "female", "desmond", "corvette", "stefania", "pepsi1", "patricio", "mivida",
            "attitude", "sadie1", "nugget", "my3kids", "lanena", "12121212", "pandas",
            "nicoleta", "misty1", "ethan", "diane", "tigers1", "skate", "lucia", "angels1",
            "159159", "squirt", "salazar", "papamama", "manila", "glamorous", "evolution", "ellie",
            "travis1", "samurai", "pinkpanther", "mumdad", "lavigne", "bernadette",
            "tommy1", "sexy1", "qwertyu", "mexican", "girlpower", "septiembre", "peanuts",
            "florida1", "eastenders", "death", "clarinet", "bridget", "456852", "razvan", "pasword",
            "nellie", "larissa", "kimmy", "gymnast", "betty", "prissy", "outlaw", "onlyme", "nayeli",
            "mygirl", "kisses1", "kermit", "indonesia", "collin", "angelic", "love07", "battle",
            "backspace", "33333", "mattie", "cheesecake", "carmel", "bhabes", "bebito", "skeeter",
            "hellomoto", "shania", "sandy1", "nicholas1", "hilaryduff", "soldier", "sadie", "hinata",
            "JESSICA", "naomi", "matias", "jeanne", "elliot", "carolyn", "puppy1", "natalie1",
            "happy123", "faithful", "catcat", "pornstar", "pizza", "herman", "faith1", "simon",
            "ilovealex", "georgie", "forest", "candace", "brooke1", "victoria1", "meagan",
            "jamesbond", "sylvester", "shortie", "iloveben", "fuckers", "dougie", "chrisb",
            "andrea1", "siobhan", "manchesterunited", "charley", "pollo", "packers", "mercury",
            "j123456", "miguelito", "kristian", "kawaii", "alexander1", "CARLOS", "teddy1", "sunny",
            "keyboard", "isaac", "febrero", "detroit", "charmed1", "renee1", "rainbows", "melina",
            "medicina", "pirate", "love01", "chemical", "vikings", "telephone", "habibi",
            "fucking", "frosty", "bumblebee", "NICOLE", "tamahome", "goodies", "258456",
            "tigger2", "rocio", "joker", "enamorada", "brutus", "babyangel", "7894561230", "1lover",
            "thompson", "thirteen", "nenalinda", "margie", "giselle", "cat123", "amarillo", "yadira",
            "qwaszx", "perros", "jaypee", "hacker", "yahooo", "soccer2", "louise1", "jericho",
            "jackie1", "domingo", "derek", "clarence", "benjie", "55555555", "megaman", "dallas1",
            "daddyyankee", "cutiepie1", "adelina", "westham", "sexy14", "randall", "playmate",
            "matematica", "littleman", "1234qwer", "together", "texas1", "power", "paolo",
            "nestor", "lemonade", "blondie1", "ANGEL", "soccer9", "skater1", "secrets", "morrison",
            "alex123", "wassup", "mikey1", "girlsrule", "fucklove", "bunny1", "mamamia", "lassie",
            "i love you", "gerardway", "deftones", "annabelle", "monkey123", "jessie1", "firefly",
            "bombom", "renren", "qweasd", "mommy2", "kaitlin", "iloveyou3", "clarissa",
            "cassie1", "bleach", "perro", "mybaby1", "julieta", "salome", "rebecca1", "malachi",
            "lexmark", "killers", "gracia", "captain", "123456j", "vicente", "unknown", "runner",
            "osito", "nicky", "murray", "floricienta", "bastard", "angelz", "porkchop",
            "popstar", "paopao", "oranges", "lancer", "flames", "solomon", "raluca", "malaysia",
            "lewis", "fucker1", "honda", "forgot", "darrell", "blackrose", "123456789a",
            "pumas", "kikay", "janeth", "irish", "beanie", "roseann", "redskins", "potato",
            "maricar", "extreme", "casanova", "vanessa1", "stonecold", "holland", "tobias",
            "teamobb", "strong", "sexy", "reynaldo", "mumanddad", "lebron", "iamthebest",
            "flowerpower", "carrot", "anime", "mommie", "darryl", "blue12", "poochie", "glenda",
            "classof07", "bobesponja", "14789632", "lance", "josiah", "dumbass", "caitlyn",
            "whiskers", "watson", "water", "therese", "monster1", "forever21", "crazygirl",
            "china", "567890", "1princess", "terry", "pangga", "klapaucius", "gemma", "froggie",
            "felix", "washington", "reading", "qqqqqq", "pinkgirl"
    };
}