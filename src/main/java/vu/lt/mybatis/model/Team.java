package vu.lt.mybatis.model;

public class Team {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.TEAM.ID
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.TEAM.NAME
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.TEAM.ID
     *
     * @return the value of PUBLIC.TEAM.ID
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.TEAM.ID
     *
     * @param id the value for PUBLIC.TEAM.ID
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.TEAM.NAME
     *
     * @return the value of PUBLIC.TEAM.NAME
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.TEAM.NAME
     *
     * @param name the value for PUBLIC.TEAM.NAME
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    public void setName(String name) {
        this.name = name;
    }
}