package adruino.program.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoController {

	@GetMapping("/percent")
	public int percent() {
		return 70;
	}
}
