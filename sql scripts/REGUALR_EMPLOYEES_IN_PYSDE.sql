SELECT em.SPECIALIZATION_ID, COUNT(*) FROM EMPLOYMENT em
    INNER JOIN EMPLOYEE e ON e.ID=em.EMPLOYEE_ID
    INNER JOIN UNIT u ON em.SCHOOL_ID=u.UNIT_ID
    INNER JOIN SPECIALIZATION s ON s.SPECIALIZATION_ID=em.SPECIALIZATION_ID
WHERE em.EMPLOYMENT_TYPE='REGULAR'
    AND em.SCHOOL_YEAR_ID=11
    AND em.IS_ACTIVE=1
    AND e.IS_ACTIVE=1
    AND u.PYSDE_ID=1
GROUP BY em.SPECIALIZATION_ID




SELECT * FROM SCHOOL_YEAR


SELECT * FROM EMPLOYEE e WHERE e.LAST_NAME LIKE '%ΞΑΝ%'

SELECT * FROM PERMANENT_TRANSFER t WHERE t.NEW_EMPLOYEE_SURNAME LIKE '%ΞΑΝ%'