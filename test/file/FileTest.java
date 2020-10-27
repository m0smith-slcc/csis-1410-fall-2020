package file;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void video_encoding__validate_encoding() {
		String encoding = "video/mp4";
		
		Video v = new Video(100, "validate_encoding", encoding);
		assertEquals(encoding, v.encoding());
	}
	
	@Test 
	void encoded__is_encoded() {
		String video_endcoding = "video/mp4";
		Encoded v = new Video(888, "is_en coded", video_endcoding);
		
		assertEquals(video_endcoding, v.encoding());
		
	
		
	}
	
	@Test
	void encoded__get_width() {
		Encoded e = new Image(765, "get_width", 640, 480, "llkkk");
		if(e instanceof Video) {
			Video i = (Video) e;
			i.some_method();
		}
		((Image) e).getWidth();
	}

}
