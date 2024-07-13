package Stream.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class Customer {
    @NonNull
    private String id;
    @NonNull
    private String pw;
    private int age;
    private String address;
    private String grade;
    private String gender;




}
