#! /bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "${DIR}"
osascript -e 'tell app "Terminal"
    do script "cd '${DIR}' &&
    java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hub.json"
end tell'
osascript -e 'tell app "Terminal"
    do script "cd '${DIR}' &&
    java -jar -Dwebdriver.gecko.driver=/usr/local/bin/geckodriver -Dwebdriver.chrome.driver=/usr/local/bin/chromedriver selenium-server-standalone-3.141.59.jar -role node -nodeConfig node.json"
end tell'
