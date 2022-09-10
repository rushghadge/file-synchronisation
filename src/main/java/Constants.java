import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final int SERVER_TCP_PORT = 6000;
    public static final int SERVER_UDP_PORT_CLIENT_ONE = 8400;
    public static final int SERVER_UDP_PORT_CLIENT_TWO = 8401;
    public static final int CLIENT_ONE_UDP_PORT = 8500;
    public static final int CLIENT_TWO_UDP_PORT = 8501;
    public static final String[][] LOCAL_DIRS = {
            {// user facing dirs
                    "C:\\filesync\\server_files\\",
                    "C:\\filesync\\client_one_files\\",
                    "C:\\filesync\\client_two_files\\"
            },
            { // backup dirs. Needed to compare files with user facing dirs for changes
                    "C:\\filesync\\backup\\server\\",
                    "C:\\filesync\\client_one\\",
                    "C:\\filesync\\client_two\\"
            }
    };

    public static final int blockSize = 2_000_000;
    public static final int MAX_DATAGRAM_SIZE = 65500;
    public static final int MONITOR_BUFFER_SIZE=6;
    public static final String CRLF = "\r\n";






}
