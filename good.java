import java.math.BigDecimal;
import java.util.Date;

// 自定义注解用于模拟表映射
@interface Table {
    String value();
}

// 自定义注解用于模拟列映射
@interface Column {
    String value();
}

@Table("project")
public class ProjectVO {

    @Column("id")
    private Integer id;

    @Column("project_name")
    private String projectName;

    @Column("project_code")
    private String projectCode;

    @Column("amount")
    private BigDecimal amount;

    @Column("description")
    private String description;

    @Column("created_at")
    private Date createdAt;

    @Column("updated_at")
    private Date updatedAt;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static void main(String[] args) {
        System.out.println("ProjectVO class created.");
    }
}