const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmpp5a5/",
            name: "ssmpp5a5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmpp5a5/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "疫情之下社区管理系统"
        } 
    }
}
export default base
