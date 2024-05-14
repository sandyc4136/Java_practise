struct Employee{
    char name[20];
    int id;
    float salary;
};

void accept_record(struct Employee *ptr){
    printf("Name : ");
    scanf("%s",ptr->name);
    printf("id : ");
    scanf("%d",&ptr->id);
    printf("Salary : ");
    scanf("%f",&ptr->salary);
}
void print_record(struct Employee *ptr){
    printf("-%30s", "-5%d2f\n", ptr->name, ptr->id, ptr->salary);
}
int Main(void){
    struct Employee emp;
    accept_record(&emp);
    print_record(&emp);
}
