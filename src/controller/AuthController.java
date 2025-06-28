public class AuthController {

     private UserService userService;

     public ResponseEntity<?> signup(@RequestBody User user) {
          return ResponseEntity.ok(userService.register(user));
     }

     @postMapping("/login")
     public ReponseEntity<?> login(@RequestBody Map<String, String> creds) {
          try {
               User user = userService.login(creds.get("email"), creds.get("password"));
               return ResponseEntity.ok(user);
          } catch (Exception .e){
               return ResponseEntity.status(HttpStatus.UNAUTHORIZED) .body(e.getMessage());
          }
}
}