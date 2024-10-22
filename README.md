## Hi I'm Kitto <img src="https://user-images.githubusercontent.com/1303154/88677602-1635ba80-d120-11ea-84d8-d263ba5fc3c0.gif" width="28px" height="28px" alt="hi">

# 💻 Công nghệ và công cụ sử dụng
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](#) [![Bootstrap Badge](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)](#) [![Mariadb Badge](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)](#) [![IDEA Badge](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](#) ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

### Class diagram
![class-diagram](https://github.com/user-attachments/assets/26701fa9-0131-4d76-a8e3-c67a1a09a74f)

### Database diagram
![database-diagram](https://github.com/user-attachments/assets/fd84e85a-f578-4f11-9b96-788975d47b1f)

##### Candidate
```
@Entity
@Table(name = "candidate")
@NamedQueries({
        @NamedQuery(name = "candidate.findCandidateBySkillLevel",
                    query = "SELECT c from Candidate c join c.candidateSkills cs where cs.skillLevel = :skillLevel "
        ),
        @NamedQuery(name = "candidate.findCandidateHasEmail",
                    query = "SELECT c from Candidate c where c.email is not null "
        )
})
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long id;
    private String last_name;
    private String middle_name;
    private String first_name;
    private String email;
    private String phone;
    private String address;
    private LocalDate dob;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<CandidateSkill> candidateSkills;

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", skillsCount=" + (candidateSkills != null ? candidateSkills.size() : 5) +  // Chỉ lấy kích thước của danh sách kỹ năng
                '}';
    }
```
##### CandidateSkill
```
@Entity
@Table(name = "candidateSkill")
public class CandidateSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
```
##### Skill
```
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_name")
    private String skillName;
    private String description;
    private String field;

    @OneToMany(mappedBy = "skill",cascade = CascadeType.ALL)
    private List<CandidateSkill> candidateSkills;
```
##### Job
```
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    private String title;
    private String description;
```
##### JobSkill
```
@Entity
@Table(name = "jobSkill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Enumerated(EnumType.STRING)
    private SkillLevel requiredSkillLevel;
```
##### SkillLevel
```
public enum SkillLevel {
    BEGINNER(1),
    INTERMEDIATE(2),
    ADVANCED(3),
    EXPERT(4),
    MASTER(5);
    private final int value;

    SkillLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
```
### index
![index](https://github.com/user-attachments/assets/5cdfbebe-4776-412b-ae75-621c001d8331)

### Home
![home](https://github.com/user-attachments/assets/ec5c2835-3eff-43f7-84db-537dec6853d6)

### job
![job](https://github.com/user-attachments/assets/87a35460-fae9-4b59-a262-6af00c1f4f05)

### skill
![skill](https://github.com/user-attachments/assets/62ca5adc-544b-4659-95dc-82584dce44db)

### Filter By Level 1
![FilterByLevel1](https://github.com/user-attachments/assets/b77da3ef-4083-47a1-a396-4268c15e875e)

### Filter By Level 2
![FilterByLevel2](https://github.com/user-attachments/assets/a6e328cb-b01e-4684-8982-ad0180678694)

### Candidate Has Email
![CandidateHasEmail](https://github.com/user-attachments/assets/0ecb7b60-1049-4e9f-98cc-f40bbdd7f4ad)





